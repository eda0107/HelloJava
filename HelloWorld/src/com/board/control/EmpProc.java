package com.board.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.board.impl.BoardCollectionImpl;
import com.board.impl.BoardServiceImpl;
import com.board.impl.EmployeeServiceImpl;
import com.board.model.Board;
import com.board.model.BoardCollection;
import com.board.model.BoardService;
import com.board.model.Employee;
import com.board.model.EmployeeService;

public class EmpProc { //Main이 실행되기 위해서 수행되어야 하는 프로세스 (EmpDAO 사용하는)
	Scanner sc = new Scanner(System.in);

	EmployeeService service = new EmployeeServiceImpl();

	public void execute() {
		while (true) {
			System.out.println("메뉴 선택하세요");
			System.out.println("1. 작성 | 2. 조회 | 3. 전체 조회 | 4. 종료 | 5. 삭제 | 6. 변경");
			int menu = 0;
			try {
				menu = sc.nextInt(); // error 발생 가능한 곳
				sc.nextLine();
			} catch (Exception e) {
				System.out.println("정상적인 메뉴를 선택하세요");
				sc.nextLine();
//				System.out.println("정상적인 메뉴를 선택하세요");
//				System.out.println("1. 작성 2. 조회 3. 전체 조회 4. 종료 5. 삭제 6. 변경");
//				menu = sc.nextInt();
//				sc.nextLine();
				// e.printStackTrace();
			}
//			sc.nextLine();
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
//		service.updateBoard(board, boardAry);

	}

	public void writeBoard() {
		System.out.println("직원 등록");
		System.out.println("직원 번호 입력: ");
		int empId = sc.nextInt();
		sc.nextLine();
		System.out.println("이름을 입력하세요 ");
		String firstName = sc.nextLine();
		System.out.println("성을 입력하세요 ");
		String lastName = sc.nextLine();
		System.out.println("이메일을 입력하세요");
		String email = sc.nextLine();
		System.out.println("입사일을 입력하세요");
		String hireDate = sc.nextLine();
		System.out.println("급여를 입력하세요");
		int salary = sc.nextInt();
		sc.nextLine();
		System.out.println("job id를 입력하세요");
		String jobId = sc.nextLine();

		Employee emp = new Employee();
		emp.setEmployeeId(empId);
		emp.setFirstName(firstName);
		emp.setLastName(lastName);
		emp.setEmail(email);
		emp.setHireDate(hireDate); // 2010-10-05
		emp.setSalary(salary);
		emp.setJobId(jobId);
		service.insertEmployee(emp);

//		Board board = new Board(first_name, last_name, email, hire_date);
//
//		service.writeBoard(board, boardAry);
//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry[i] == null); {
//				boardAry[i] = board;
//				break;
//			}
//		}
	}

	public void getBoard() {
		System.out.println("한 건 조회");
		System.out.println("조회할 사원 번호를 입력: ");
		int empNo = sc.nextInt();
		Employee emp = service.getEmployee(empNo);
		System.out.println(emp);

//		Board board = service.getBoard(boardNo, boardAry);
//		System.out.println(board);
//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry[i] != null && boardAry[i].getBoardNo() == boardNo) {
//				System.out.println(boardAry[i].getTitle() + "," + boardAry[i].getContents());
//			}
//		}
	}

	public void getBoardList() {
		System.out.println("전체 글 조회");
//		Board[] resultAry = service.getBoardList(boardAry);
		List<Employee> employees = service.getEmpList();
		for (Employee employee : employees) {
			System.out.println(employee);
		}
//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry[i] != null) {
//				System.out.println(boardAry[i].getTitle() + "," + boardAry[i].getContents());
//			}
//		}

	}

	public void delBoard() {
		System.out.println("삭제할 사원 번호 입력");
		int empNo = sc.nextInt();
		sc.nextLine();
		service.deleteEmployee(empNo);

//		service.deleteBoard(boardNo2, boardAry);

	}
}
