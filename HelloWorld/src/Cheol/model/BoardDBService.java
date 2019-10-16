package Cheol.model;

import java.util.List;

public interface BoardDBService {
	
	
	
//	public List<BoardDB> getBoardList(); //게시글 전체 조회
	
	public BoardDB getBoard(int boardNo);  //한 건 조회
	
	public void insertBoard(BoardDB board); //게시글 작성
	
	
//	public void updateBoard(BoardDB board); //수정
//
//	public void deleteBoard(BoardDB board); //삭제
	
	public List<BoardDB> getReplyList(int boardNo); //댓글 조회
	
//	public void insertReply(BoardDB board); //댓글 추가
	
	public String logInCheck(String id, String passwd);
}
