package com.board.model;

public class BoardDB {
	
	private String boardNo;
	private String title;
	private String content;
	private String writer;
	private String creationDate;
	private int origNo;
	
	
	
	public String getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(String boardNo) {
		this.boardNo = boardNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public int getOrigNo() {
		return origNo;
	}
	public void setOrigNo(int origNo) {
		this.origNo = origNo;
	}
	
	
	

}
