package com.board.impl;

import java.util.List;

import com.board.model.BoardDB;
import com.board.model.BoardDBService;

public class BoardDBServiceImpl implements BoardDBService {
	BoardDBDAO dao = new BoardDBDAO();

	@Override
	public void insertBoard(BoardDB board) {
		dao.insertBoard(board);

	}

	@Override
	public List<BoardDB> getBoardList() {

		return dao.getBoardList();
	}

	@Override
	public BoardDB getBoard(int boardNo) {

		return dao.getBoard(boardNo);
	}

	@Override
	public void updateBoard(BoardDB board) {

		dao.updateBoard(board);
	}

	@Override
	public void deleteBoard(int boardNo) {

	}

	@Override
	public List<BoardDB> getReply(int boardNo) {

		return dao.getReplyList(boardNo);
	}

	@Override
	public void insertReply(BoardDB board) {
		dao.replyBoard(board);
	}

	@Override
	public String logInCheck(String id, String passwd) {
		String name = dao.getUserName(id, passwd);

		return name;

	}

}
