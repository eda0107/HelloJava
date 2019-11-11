package co.micol.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import co.micol.dto.BoardDto;

public class BoardDao extends DAO {
	private BoardDto dto;
	private ArrayList<BoardDto> list;
	
	public BoardDao() {
		super(); // 부모의 생성자를 물려받겠다
	}
	
	public ArrayList<BoardDto> select(int id) { // 전체 리스트 또는 한 개 가져오기
		list = new ArrayList<BoardDto>();		// id = 0: 전체, id = n: 그룹(답글 포함) n 전체
		String sql = "SELECT * FROM mvc_board";
					 if (id != 0) sql = sql + "WHERE bgroup = ?";
					 try {
						 pstmt = conn.prepareStatement(sql);
						 if (id != 0) pstmt.setInt(1, id);
						 rs = pstmt.executeQuery();
						 while (rs.next()) {
							 dto = new BoardDto();
							 // 이하 레코드 담기
							 list.add(dto);
						 }
					 } catch (SQLException e) {
						 e.printStackTrace();
					 }
		return list;
	}
	
	
	public int insert(BoardDto dto) {
		int n = 0;
		return n;
	}
	
	
	
	
	public int update(BoardDto dto) {
		int n = 0;
		return n;
	}
	
	
	
	
	public int delete(int id) { 
		int n = 0;
		return n;
	}
}
