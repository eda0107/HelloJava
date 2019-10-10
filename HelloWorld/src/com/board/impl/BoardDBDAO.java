package com.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.board.common.DAO;
import com.board.model.Board;
import com.board.model.BoardDB;

public class BoardDBDAO {

	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;

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
