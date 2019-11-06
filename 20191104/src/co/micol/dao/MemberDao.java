package co.micol.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import co.micol.dto.MemberDto;

public class MemberDao {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "nino";
	private String password = "1234";

	public MemberDao() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	public ArrayList<MemberDto> select() { // select Method
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		// 관리자 입장에서 조회 구문 작성하기(여러 명 데이터 확인)
		MemberDto dto;
		String sql = "select * from member";
		try {
			pstmt=conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				dto = new MemberDto();
				dto.setId(rs.getString("memberid"));
				dto.setName(rs.getString("membername"));
				dto.setGrant(rs.getString("membergrant"));
				dto.setEnterDate(rs.getDate("memberenterdate"));
				dto.setAddr(rs.getString("memberaddr"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return list;
	}

	public MemberDto select(String id) { // id값을 던져줌 //한 명 데이터 확인 //일종의 오버라이드
		MemberDto dto = new MemberDto();
		String sql = "select * from member where memberid=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id); // 물음표가 하나 있는 거: 1번
			rs = pstmt.executeQuery();
			if (rs.next()) {// 레코드가 하나라서 while 돌릴 필요가 없음
				dto.setId(rs.getString("memberid"));
				dto.setName(rs.getString("membername"));
				dto.setPassword(rs.getString("memberpw"));
				dto.setGrant(rs.getString("membergrant"));
				dto.setEnterDate(rs.getDate("memberenterdate"));
				dto.setAddr(rs.getString("memberaddr"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return dto;
	}

	public String isLoginCheck(String id, String pw) { //로그인 확인
		String grant = null;
		String sql = "select * from member where memberid = ? and memberpw = ?"; // id와 pw가 일치하면
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				grant = rs.getString("membergrant"); //그랜트 값을 가지고 와서 return
				}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return grant;
	}

	public int insert(MemberDto dto) { // insert Method
		int n = 0;
		// 추가 구문 작성하기
		String sql = "insert into member(memberid, membername, memberpw, memberaddr)"+
		"values(?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getPassword());
			pstmt.setString(4, dto.getAddr());
			n = pstmt.executeUpdate(); //성공하면 1 실패하면 0이라는 숫자가 뜰 것
			//select는 executeQuery지만 insert는 executeUpdate -> 정수 타입을 리턴하기 때문
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			close();
		}
		
		return n;
	}

	public int update(MemberDto dto) { // update Method
		int n = 0;
		// 갱신 구문 작성하기
		String sql = "update member set membername=?, memberaddr=? where memberid=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setString(3, dto.getId());
			n = pstmt.executeUpdate();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}finally {
			close();
		}

		return n;
	}

	public int delete(MemberDto dto) { // delete Method
		int n = 0;
		// 삭제 구문 작성하기

		return n;
	}
	
	public boolean isIdCheck(String id) { //아이디 중복체크 메소드
		boolean b = true; //존재하지 않으면 true
		String sql = "select memberid from member where memberid=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				b = false; //존재하면 false가 리턴
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return b;
	}

	private void close() {
		try {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
