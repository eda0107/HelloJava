package com.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.board.common.DAO;
import com.board.model.BoardDB;

public class BoardDBDAO {

	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;

	public void updateBoard(BoardDB board) {
		conn = DAO.getConnect();
		String sql = "update boards set orgi_no = orgi_no ";
		if (board.getTitle() != null && !board.getTitle().equals("")) {
			sql += ",title=? ";
		}
		if (board.getContent() != null && !board.getContent().equals("")) {
			sql += ",contents=? ";
		}
		sql += "where board_no=? and orig_no is null ";

		int n = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			if (board.getTitle() != null && !board.getTitle().equals("")) {
				pstmt.setString(++n, board.getTitle());
			}
			if (board.getContent() != null  && !board.getContent().equals("")) {
				pstmt.setString(++n, board.getContent());
			}
			pstmt.setInt(++n, board.getBoardNo());
			pstmt.execute();
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

	public void replyBoard(BoardDB board) {
		conn = DAO.getConnect();
		String sql = "insert into boards values((select max(board_no)+1 " + "from boards),?,?,?,sysdate,?)"; // null을 ?로
		// 바꿈
		// board_seq.nextval

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, board.getTitle()); //
			pstmt.setString(2, board.getContent());
			pstmt.setString(3, board.getWriter());
//	         pstmt.setString(4, board.getCreationDate()); sysdate 씀
			pstmt.setInt(4, board.getOrigNo()); // 원본글이라 댓글번호 ㄴㄴ

			int r = pstmt.executeUpdate();
			System.out.println(r + " 건이 입력되었습니다.");

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

	public List<BoardDB> getBoardList() {
		conn = DAO.getConnect();
		String sql = "select * from boards where orig_no is null order by board_no desc";
		List<BoardDB> list = new ArrayList<>();
		BoardDB board = null;

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				board = new BoardDB();
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setCreationDate(rs.getString("creation_date"));
	
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

	public List<BoardDB> getReplyList(int boardNo) {
		conn = DAO.getConnect();
		String sql = "select * from boards where orig_no = " + boardNo;
		List<BoardDB> list = new ArrayList<>();

		try {
			pstmt = conn.prepareStatement(sql);
			// pstmt.setInt(1, boardNo);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardDB board = new BoardDB();
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
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
		BoardDB board = new BoardDB();
		conn = DAO.getConnect();
		String sql = "select * from boards where board_no = ? and orig_no is null";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				board = new BoardDB();
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setCreationDate(rs.getString("creation_date"));
				board.setOrigNo(rs.getInt("orig_no"));

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

		return board;

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
