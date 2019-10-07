package Classis;

import java.util.Scanner;

public class MemberEx {

	private static Member[] memberArray = new Member[5];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("=============================================");
			System.out.println("1. 회원 등록 2. 회원번호 조회 3. 그룹별 리스트 4. 종료");
			System.out.println("=============================================");

			int no = sc.nextInt();
			sc.nextLine();
			if (no == 1) {
				createMember();
			} else if (no == 2) {
				getMemberList();
			} else if (no == 3) {
				getCourseName();
			} else if (no == 4) {
				run = false;
			}

		}
		System.out.println("종료");
	}

	

	private static void createMember() {
		System.out.println("회원 번호 입력");
		String memberNo = sc.nextLine();
		System.out.println("회원 이름 입력");
		String memberName = sc.nextLine();
		System.out.println("무슨 과정을 듣나요?");
		String courseName = sc.nextLine();
		
		

		Member mbr = new Member(memberNo, memberName, courseName);
		for (int i = 0; i < memberArray.length; i++) {
			if (memberArray[i] == null) {
				memberArray[i] = mbr;
				break;
			}
		}

	}

	private static void getMemberList() {
		for (Member mbr : memberArray) {
			if (mbr != null)
				System.out.println("회원 번호는 " + mbr.getId() + " 이름은 " + mbr.getName() + " 과정은 " + mbr.getCourse());
		}

	}

	private static void getCourseName() {
		System.out.println("회원 이름 입력");
		String memberName = sc.nextLine();
		System.out.println("회원 번호 입력");
		String memberNo = sc.nextLine();

	}

}
