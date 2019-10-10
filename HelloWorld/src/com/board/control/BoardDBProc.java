package com.board.control;

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
			System.out.println("1. 게시글 작성 | 2. 게시글 전체 조회 | 9. 종료");
			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				System.out.println("1번을 선택했습니다.");
				writeBoardD();
			} else if (menu == 2) {
				System.out.println("2번을 선택했습니다.");
			}

		}
	}

	private void writeBoardD() {
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
