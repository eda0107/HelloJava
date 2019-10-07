package com.board.model;

import java.util.List;

public interface BoardCollection { //여기 적은 기능을 구현한 것이 ServiceImpl
	public void writeBoard(Board board, List<Board> boards); //글 작성 
	//Board [] boards가 DB역할을 함
	public Board getBoard(int boardNo, List<Board> boards); //한 건 조회

	public List<Board> getBoardList(List<Board> boards); //전체리스트
	
	public void deleteBoard(int boardNo2, List<Board> boards); //삭제하기
	
	public void updateBoard(Board board, List<Board> boards); //변경하기
		
	
	//내용 변경
	//글 삭제
}
