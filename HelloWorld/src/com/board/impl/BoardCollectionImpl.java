package com.board.impl;

import java.util.ArrayList;
import java.util.List;

import com.board.model.Board;
import com.board.model.BoardCollection;

public class BoardCollectionImpl implements BoardCollection {

	@Override
	public void writeBoard(Board board, List<Board> boards) {
		boards.add(board);

	}

	@Override
	public Board getBoard(int boardNo, List<Board> boards) {
		Board board = null;
		for (Board brd : boards) {
			if (brd.getBoardNo() == boardNo) {
				board = brd;
			}
		}
		return board;
	}

	@Override
	public List<Board> getBoardList(List<Board> boards) {
		List<Board> list = new ArrayList<>();
		for (Board brd : boards) {
			list.add(brd);
		}
		return list;
	}

	@Override
	public void deleteBoard(int boardNo, List<Board> boards) {
		for (Board brd : boards) {
			if (brd.getBoardNo() == boardNo) {
				boards.remove(brd);

			}
		}

	}

	@Override
	public void updateBoard(Board board, List<Board> boards) {
		for (Board brd : boards) {
			if (brd.getBoardNo() == board.getBoardNo()) {
				brd.setTitle(board.getTitle());
				brd.setContents(board.getContents());
				brd.setWriter(board.getWriter());
			}

		}

	}

//	@Override
//	public void writeBoard(Board board, List<Board> boards) {
//		for (int i = 0; i < boards.length; i++) {
//			if (boards[i] == null) {
//				boards[i] = board;
//				break;
//			}
//		}
//
//	}
//
//	@Override
//	public Board getBoard(int boardNo, List<Board> boards) {
//		Board board = null;
//
//		for (int i = 0; i < boards.length; i++) {
//			if (boards[i] != null && boards[i].getBoardNo() == boardNo) {
//				board = boards[i];
//			}
//		}
//		return board;
//	}
//
//	@Override
//	public Board[] getBoardList(List<Board> boards) {
//		Board[] boardAry = new Board[boards.length];
//		for (int i = 0; i < boards.length; i++) {
//			boardAry[i] = boards[i];
//		}
//		return boardAry;
//	}
//
//	@Override
//	public void deleteBoard(int boardNo2, List<Board> boards) { // 넣은 값을 삭제하는 코드
//		for (int i = 0; i < boards.length; i++) {
//			if (boards[i] != null && boards[i].getBoardNo() == boardNo2) {
//				boards[i] = null;
//
//			}
//		}
//
//	}
//
//	@Override
//	public void updateBoard(Board board, List<Board> boards) {
//		for (int i = 0; i < boards.length; i++) {
//			if (boards[i] != null && boards[i].getBoardNo() == board.getBoardNo()) {
//				boards[i].setContents(board.getContents());
//
//				boards[i].setTitle(board.getTitle());
//				boards[i].setWriter(board.getWriter());
//			}
//		}
//
//	}

}
