package Cheol.impl;

import java.util.List;

import Cheol.model.BoardDB;
import Cheol.model.BoardDBService;

public class BoardDBServiceImpl implements BoardDBService {
	BoardDBDAO dao = new BoardDBDAO();

	@Override
	public void insertBoard(BoardDB board) {
		dao.insertBoard(board);

	}

//	@Override
////	public List<BoardDB> getBoardList() {
//
//		return dao.getBoardList();s
//	}

	@Override
	public BoardDB getBoard(int boardNo) {

		return dao.getBoard(boardNo);
	}

//	@Override
//	public void updateBoard(BoardDB board) {
////해당 글에 대한 권한이 있는지 확인하는 부분
//		if (dao.checkResponsibility(board)) {
//			dao.updateBoard(board);
//			System.out.println("변경되었습니다");
//		} else {
//
//			System.out.println("해당글에 대한 권한이 없습니다.");
//			dao.updateBoard(board);
//		}
//	}

//	@Override
//	public void deleteBoard(BoardDB board) {
//		if (dao.checkResponsibility(board)) { //권한체크
//			if (!dao.checkForReply(board.getBoardNo())) { //댓글 유무 체크
//				dao.deleteBoard2(board);
//				System.out.println("삭제되었습니다");
//			} else {
//				System.out.println("댓글이 존재합니다");
//			}
//		} else {
//			System.out.println("해당 글에 대한 권한이 없습니다.");
//		}

//	}

	@Override
	public List<BoardDB> getReplyList(int boardNo) {

		return dao.getReplyList(boardNo);
	}

//	@Override
//	public void insertReply(BoardDB board) {
//		dao.replyBoard(board);
//	}

	@Override
	public String logInCheck(String id, String passwd) {
		String name = dao.getUserName(id, passwd);

		return name;

	}

}
