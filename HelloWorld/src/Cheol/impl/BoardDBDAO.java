package Cheol.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Cheol.common.DAO;
import Cheol.model.BoardDB;

public class BoardDBDAO {

	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	
	public List<BoardDB> getReplyList(int boardNo){
		List<BoardDB> list = null;
		BoardDB board = null;
		conn = DAO.getConnect();
		String sql = "select board_no, content, writer, creation_date, orig_no "+
					 "from boards "+
				     "where orig_no = ? ";
		try {
			pstmt= conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				board = new BoardDB();
				board.setBoardNo(rs.getInt("board_no"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setCreationDate(rs.getString("creation_date"));
				board.setOrigNo(rs.getInt("orig_no"));
				list.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	
	public BoardDB getBoard(int boardNo) {
		BoardDB result = null;
		conn = DAO.getConnect();
		String sql = "select board_no, title, content, writer, creation_date "+
					 "from boards " +
				     "where board_no = ? and orig_no is null";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result.setBoardNo(rs.getInt("board_no"));
				result.setTitle(rs.getString("title"));
				result.setTitle(rs.getString("content"));
				result.setTitle(rs.getString("writer"));
				result.setTitle(rs.getString("creation_date"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/*
	 * public List<BoardDB> getBoardList() { List<BoardDB> list = new ArrayList<>();
	 * conn = DAO.getConnect(); String sql = "select * from boards order by desc";
	 * Board brdDB = null;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * return list;
	 * 
	 * 
	 * }
	 */

	public void insertBoard(BoardDB board) {
		conn = DAO.getConnect();
		String sql = "insert into boards values((select nvl (max(board_no), 0)+1 from boards), ?, ?, ?, sysdate, null)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setString(3, board.getWriter());

			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 입력되었습니다.");

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

	}

	public String getUserName(String id, String passwd) {
		conn = DAO.getConnect(); // DB 연결하는 메소드를 사용
		String sql = "select * from user_login where id=? and passwd=?";
		String name = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, passwd);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				name = rs.getString("name");

			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

		return name;
	}
}
