package com.DBprogram.control;

import java.util.Scanner;

import com.DBprogram.impl.DBProgramServiceImpl;
import com.DBprogram.model.DBProgram;
import com.DBprogram.model.DBProgramService;

public class DBProgramProc {

	Scanner sc = new Scanner(System.in);
	DBProgramService service = new DBProgramServiceImpl();

	public void execute() {
		System.out.println("사원 등록 프로그램을 실행합니다.");

		while (true) {
			int menu = 0;
			System.out.println("1.사원 등록 | 2.사원 이름 조회 | 3.부서별 조회 | 4.부서 변경 | 5.퇴사 처리 | 6. 종료 ");
			menu = sc.nextInt();
			sc.nextLine();

			if (menu == 1) {
				insertEmp();
			} else if (menu == 2) {
				getEmpName();
			} else if (menu == 3) {
				getDeptList();
			} else if (menu == 4) {
				changeDept();
			} else if (menu == 5) {
				deleteDept();
			} else if (menu == 6) {
				break;
			}

		}

	}

	public void insertEmp() {
//		System.out.println("사원 번호를 입력하세요.");
//		int employeeNo = sc.nextInt();
//		sc.nextLine();
		System.out.println("사원 이름을 입력하세요.");
		String employeeName = sc.nextLine();
		System.out.println("부서를 입력하세요.");
		String deptNo = sc.nextLine();
		System.out.println("급여를 입력하세요.");
		int salary = sc.nextInt();
		sc.nextLine();
		System.out.println("입사일을 입력하세요.");
		String hireDate = sc.nextLine();

		DBProgram emp = new DBProgram();
		emp.setEmployeeName(employeeName);
		emp.setDeptNo(deptNo);
		emp.setSalary(salary);
		emp.setHireDate(hireDate);
		
		service.insertEmployee(emp);
		
	}

	public void getEmpName() {
		System.out.println("사원 이름 조회");
		

	}

	public void getDeptList() {

	}

	public void changeDept() {

	}

	public void deleteDept() {

	}

}
