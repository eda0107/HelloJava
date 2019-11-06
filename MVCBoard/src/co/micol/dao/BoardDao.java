package co.micol.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import co.micol.dto.BoardDto;

public class BoardDao {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "nino";
	String password = "1234";

	public BoardDao() {

		try {

			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<BoardDto> select() { // 전체리스트
		ArrayList<BoardDto> list = new ArrayList<BoardDto>();
		BoardDto dto;
		String sql = "select * from mvc_board order by bid desc";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(); // select니까 rs
			while (rs.next()) { // 얼마나 많이 sql이 넘어온지 모르니까 while 사용
				dto = new BoardDto();
				dto.setId(rs.getInt("bid")); // rs객체가 가지고 있는 get 메소드를 통해서 테이블의 칼럼명을 가지고 옴
				dto.setName(rs.getString("bname"));
				dto.setTitle(rs.getString("btitle"));
				dto.setContent(rs.getString("bcontent"));
				dto.setwDate(rs.getDate("bdate"));
				dto.setHit(rs.getInt("bhit"));
				dto.setGroup(rs.getInt("bgroup"));
				dto.setStep(rs.getInt("bstep"));
				dto.setIndent(rs.getInt("bindent"));

				list.add(dto); //dto를 리스트에 추가

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		close();
		return list;
	}

	public BoardDto select(int id) { // 세부목록조회
		BoardDto dto = new BoardDto(); 
		String sql = "select * from mvc_board where bid=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery(); // select니까 rs
			if (rs.next()) { 
				
				dto.setName(rs.getString("bname"));
				dto.setTitle(rs.getString("btitle"));
				dto.setContent(rs.getString("bcontent"));
				dto.setwDate(rs.getDate("bdate"));
				dto.setHit(rs.getInt("bhit"));
				dto.setId(rs.getInt("bid"));
				dto.setGroup(rs.getInt("bgroup"));
				dto.setStep(rs.getInt("bstep"));
				dto.setIndent(rs.getInt("bindent"));
				
				viewCountUpdate(rs.getInt("bid")); //조회수 증가 메소드 호출
				
		
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		close();
		return dto;
	}

	private void viewCountUpdate(int id) { //조회수 증가
		// TODO Auto-generated method stub
		
		String sql = "update mvc_board set bhit = bhit+1 where bid=" + id;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	public int insert(BoardDto dto) { // 글 추가
		int n = 0;
		String sql="insert into mvc_board(bid, bname, btitle, bcontent, bdate, bgroup, bstep, bindent) "
				+"values(b_num.nextval,?,?,?,?,b_num.currval,0,0)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getTitle());
			pstmt.setString(3, dto.getContent());
			pstmt.setDate(4, dto.getwDate());
			n = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		close();
		return n;
	}

	public int update(BoardDto dto) { // 글 갱신
		int n = 0;

		close();
		return n;
	}

	public int delete(BoardDto dto) { // 글 삭제
		int n = 0;

		close();
		return n;
	}

	private void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
