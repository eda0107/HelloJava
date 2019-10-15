package com.board.control;

import java.util.List;
import java.util.Scanner;

import com.board.impl.BoardDBServiceImpl;
import com.board.model.BoardDB;
import com.board.model.BoardDBService;

public class BoardDBProc {

	Scanner sc = new Scanner(System.in);
	BoardDBService service = new BoardDBServiceImpl();
	String loginId = null;

	public void execute() {
		logInCheck();

		while (true) {
			int menu = 0;
			System.out.println("1. 게시글 작성 | 2. 게시글 전체 조회 | 3. 게시글 조회 | 4. 게시글 수정 | 5. 삭제 | 6. | 7. | 8. | 9. 종료");
			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				System.out.println("1번을 선택했습니다.");
				writeBoardD();
			} else if (menu == 2) {
				getBoardList();
				System.out.println("2번을 선택했습니다.");
				getBoardList();
			} else if (menu == 3) {
				System.out.println("3번을 선택했습니다");
				getBoard();
			} else if (menu == 4) {
				System.out.println("4번을 선택했습니다");
				updateBoard();
			} else if (menu == 5) {
				System.out.println("5번을 선택했습니다");
				deleteBoard2();
			} 

		}
	}

	public void deleteBoard2() {
		System.out.println("삭제할 글번호 입력");
		int boardNo = sc.nextInt();
		sc.nextLine();
		BoardDB board = new BoardDB();
		board.setBoardNo(boardNo);
		board.setWriter(loginId); // id를 받아야 함

		service.deleteBoard(board);

	}

	public void updateBoard() {
		System.out.println("변경할 글 번호를 입력하세요.");
		int boardNo = sc.nextInt();
		sc.nextLine();
		System.out.println("변경할 제목을 입력하세요 ");
		String title = sc.nextLine();
		System.out.println("변경 내용을 입력하세요");
		String content = sc.nextLine();
		BoardDB board = new BoardDB();
		board.setBoardNo(boardNo);
		board.setTitle(title);
		board.setContent(content);
		board.setWriter(loginId);

		service.updateBoard(board);
	}

	public void getBoardList() {
		System.out.println("게시글 전체 조회");
		List<BoardDB> list = service.getBoardList();
		for (BoardDB dbr : list) {
			System.out.println(dbr.getBoardNo() + " 제목 " + dbr.getTitle() + " 내용 " + dbr.getContent());
			System.out.println("작성자 " + dbr.getWriter() + " 작성 날짜 " + dbr.getCreationDate());
		}

	}

	public void getBoard() {
		System.out.println("조회할 게시글 번호");
		int boardNo = sc.nextInt();
		sc.nextLine();

		BoardDB board = service.getBoard(boardNo);
		System.out.println(board + "," + board.getBoardNo());
		if (board != null && board.getBoardNo() != 0) {
			System.out.println("===========<원본>============"); // 원본

			System.out.println("제목: " + board.getTitle());
			System.out.println("내용: " + board.getContent());
			System.out.println("작성자: " + board.getWriter());
			System.out.println("작성일자: " + board.getCreationDate());

			List<BoardDB> list = service.getReply(boardNo); // 댓글
			if (list.size() > 0) {
				System.out.println("==========<댓글>==========");

				for (BoardDB brd : list) {
					System.out.println(
							"->" + brd.getBoardNo() + " | " + brd.getContent() + " | " + brd.getCreationDate());
				}
				System.out.println("==========================");

			} else {
				System.out.println("댓글없음");
			}
			System.out.println("1. 댓글 작성 | 2. 이전 메뉴");
			int subMenu = sc.nextInt();
			sc.nextLine();

			if (subMenu == 1) {
				System.out.println("댓글을 작성하세요");
				String reply = sc.nextLine();
				BoardDB board1 = new BoardDB();
				board1.setContent(reply);
				board1.setOrigNo(board.getBoardNo()); // boardNo와 동일
				board1.setWriter(loginId);
				service.insertReply(board1);

			} else {
				return;
			}
		} else {
			System.out.println("존재하지 않음");
			return;

		}

	}

	public void writeBoardD() {
		System.out.println("게시글 작성");
		System.out.println("제목");
		String title = sc.nextLine();
		System.out.println("내용");
		String content = sc.nextLine();
		BoardDB board = new BoardDB();

		board.setTitle(title);
		board.setContent(content);
		board.setWriter(loginId); // 로그인 한 사람만 쓸 수 있게
		service.insertBoard(board);

	}

	public void logInCheck() {
		while (true) {
			System.out.println("id를 입력하세요");
			String id = sc.nextLine();
			System.out.println("pw를 입력하세요");
			String passwd = sc.nextLine();
			String name = service.logInCheck(id, passwd); // 결과 값을 가지고 온 것

			if (name != null) {
				System.out.println(name + "님 환영합니다");
				loginId = id;
				break;
			} else {
				System.out.println("다시 입력하세요");
			}
		}
	}

}
