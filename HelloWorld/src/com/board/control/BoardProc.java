package com.board.control;

import java.util.Scanner;

import com.board.impl.BoardServiceImpl;
import com.board.model.Board;
import com.board.model.BoardService;

public class BoardProc {
	Scanner sc = new Scanner(System.in);
	Board[] boardAry = new Board[10];
	BoardService service = new BoardServiceImpl();

	public void execute() {
		while (true) {
			System.out.println("메뉴 선택하세요");
			System.out.println("1. 작성 2. 조회 3. 전체 조회 4. 종료 5. 삭제 6. 변경");
			int menu = 0;
			try {
				menu = sc.nextInt(); //error 발생 가능한 곳
				sc.nextLine();
			} catch (Exception e) {
				System.out.println("정상적인 메뉴를 선택하세요");
				sc.nextLine();
//				System.out.println("정상적인 메뉴를 선택하세요");
//				System.out.println("1. 작성 2. 조회 3. 전체 조회 4. 종료 5. 삭제 6. 변경");
//				menu = sc.nextInt();
//				sc.nextLine();
				//e.printStackTrace();
			}
			sc.nextLine();
			if (menu == 1) {
				writeBoard();
			} else if (menu == 2) {
				getBoard();
			} else if (menu == 3) {
				getBoardList();
			} else if (menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (menu == 5) {
				delBoard();
			} else if (menu == 6) {
				updateBoard();
			}
		}
		System.out.println("프로그램 종료");

	}

	public void updateBoard() {
		System.out.println("변경할 글 번호:");
		int boardNo = sc.nextInt();
		sc.nextLine();
		System.out.println("변경할 내용: ");
		String content = sc.nextLine();
		System.out.println("변경할 제목: ");
		String title = sc.nextLine();
		System.out.println("변경할 작성자:");
		String writer = sc.nextLine();
		Board board = new Board(boardNo, title, content, writer);
		service.updateBoard(board, boardAry);

	}

	public void writeBoard() {
		System.out.println("글 작성");
		System.out.println("게시글 번호 입력: ");
		int boardNo = sc.nextInt();
		sc.nextLine();
		System.out.println("제목 입력: ");
		String title = sc.nextLine();
		System.out.println("내용 입력: ");
		String contents = sc.nextLine();
		System.out.println("작성자 입력: ");
		String writer = sc.nextLine();
		Board board = new Board(boardNo, title, contents, writer);

		service.writeBoard(board, boardAry);
//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry[i] == null); {
//				boardAry[i] = board;
//				break;
//			}
//		}
	}

	public void getBoard() {
		System.out.println("한 건 조회");
		System.out.println("조회할 번호 입력: ");
		int boardNo = sc.nextInt();

		Board board = service.getBoard(boardNo, boardAry);
		System.out.println(board);
//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry[i] != null && boardAry[i].getBoardNo() == boardNo) {
//				System.out.println(boardAry[i].getTitle() + "," + boardAry[i].getContents());
//			}
//		}
	}

	public void getBoardList() {
		System.out.println("전체 글 조회");
		Board[] resultAry = service.getBoardList(boardAry);
		for (Board brd : resultAry) {
			System.out.println(brd);
		}
//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry[i] != null) {
//				System.out.println(boardAry[i].getTitle() + "," + boardAry[i].getContents());
//			}
//		}

	}

	public void delBoard() {
		System.out.println("삭제할 번호?");
		int boardNo2 = sc.nextInt();

		service.deleteBoard(boardNo2, boardAry);

	}
}
