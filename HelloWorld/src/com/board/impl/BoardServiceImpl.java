package com.board.impl;

import com.board.model.Board;
import com.board.model.BoardService;

public class BoardServiceImpl implements BoardService {

	@Override
	public void writeBoard(Board board, Board[] boards) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] == null) {
				boards[i] = board;
				break;
			}
		}

	}

	@Override
	public Board getBoard(int boardNo, Board[] boards) {
		Board board = null;

		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBoardNo() == boardNo) {
				board = boards[i];
			}
		}
		return board;
	}

	@Override
	public Board[] getBoardList(Board[] boards) {
		Board[] boardAry = new Board[boards.length];
		for (int i = 0; i < boards.length; i++) {
			boardAry[i] = boards[i];
		}
		return boardAry;
	}

	@Override
	public void deleteBoard(int boardNo2, Board[] boards) { //넣은 값을 삭제하는 코드
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBoardNo() == boardNo2) {
				boards[i] = null;

			}
		}
	
		
	}

	@Override
	public void updateBoard(Board board, Board[] boards) {
		for (int i = 0; i < boards.length; i++) {
		if (boards[i] != null && boards[i].getBoardNo() == board.getBoardNo()) {
			 boards[i].setContents(board.getContents());

			 boards[i].setTitle(board.getTitle());
			 boards[i].setWriter(board.getWriter());
		}
	}
		
		
	}

}
