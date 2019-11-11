/**
 * 
 */
package co.micol.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import co.micol.dto.MemberDto;

/**
 * @author User
 * 상위 DAO 클래스를 상속받음
 */
public class MemberDao extends DAO {
	private MemberDto dto;
	private ArrayList<MemberDto> list;
	
	public MemberDao() {
		super();
	}
	
	
	
	
	public ArrayList<MemberDto> select() { // 전체 회원 목록
		list = new ArrayList<MemberDto>();
		String sql = "SELECT memberid, membername, memberenterdate, memberaddr, membertel FROM member";
		try {
			pstmt = conn.prepareStatement(sql);
	        rs = pstmt.executeQuery();
	        while (rs.next()) {
	        	MemberDto dto = new MemberDto();
	        	dto.setId(rs.getString("memberid"));
	        	dto.setName(rs.getString("membername"));
	        	dto.seteDate(rs.getDate("memberenterdate"));
	        	dto.setAddr(rs.getString("memberaddr"));
	        	dto.setTel(rs.getString("membertel"));
	        	list.add(dto);
	        }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		return list;
	}
	
	
	
	
	public MemberDto select(String id) { // 한 명의 회원 정보
		dto = new MemberDto();
		close();
		return dto;
	}
	
	
	
	public int insert (MemberDto dto) {
		int n = 0;
		String sql = "INSERT INTO member(memberid, membername, memberpw, memberaddr, membertel" + ") VALUES(?, ?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getPassword());
			pstmt.setString(4, dto.getAddr());
			pstmt.setString(5, dto.getTel());
			n = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		return n;
	}
	
	
	
	
	
	public int update (MemberDto dto) {
		int n = 0;
		close();
		return n;
	}

	
	
	
	
	public int delete (String id) {
		int n = 0;
		close();
		return n;
	}
	
	
	
	public boolean isIdCheck(String id) { // ID 중복 체크
	      boolean b = true;
	      String sql = "select memberid from member where memberid = ?";
	      try {
	         pstmt = conn.prepareStatement(sql);
	         pstmt.setString(1, id);
	         rs = pstmt.executeQuery();
	         if (rs.next()) {
	            b = false;
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
	      close();
	      return b;
	}
	
	
	
	
	
	public  String loginCheck(String id, String pw) { // 로그인 성공 시 권한 넘겨 줌
		String grant = null;
		String sql = "SELECT MEMBERGRANT FROM member WHERE MEMBERID = ? AND MEMBERPW = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				grant = rs.getString("membergrant");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		return grant;
	}
}
