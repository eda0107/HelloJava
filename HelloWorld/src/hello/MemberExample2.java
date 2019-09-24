package hello;

import java.util.Scanner;

public class MemberExample2 {
	private static MemberEx[] memberArray = new MemberEx[10];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("==================================");
			System.out.println("1. 생성 2. 전체 리스트 3. 조회 4.종료");
			System.out.println("==================================");
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				createMember();
			} else if (menu == 2) {
				getMemberList();
			} else if (menu == 3) {
				idAndPw();
			} else if (menu == 4) {
				run = false;
			}

		}
		System.out.println("프로그램 종료");

	}

	public static void createMember() {
		// System.out.println("createMember()");
		System.out.println("멤버 이름 입력");
		String memberName = sc.nextLine();
		System.out.println("멤버 아이디 입력");
		String memberId = sc.nextLine();
		System.out.println("비밀번호는?");
		String memberPw = sc.nextLine();
		System.out.println("나이는?");
		int memberAge = sc.nextInt();
		MemberEx mbr = new MemberEx(memberName, memberId, memberPw, memberAge);
		for (int i = 0; i < memberArray.length; i++) {
			if (memberArray[i] == null) {
				memberArray[i] = mbr;
				break;
			} // 멤버 인스턴스 만드는 메소드

		}
	}

	public static void getMemberList() {
		for (MemberEx mbr : memberArray) {
			if (mbr != null)
				System.out.println("멤버 이름: " + mbr.getName() + ", 아이디: " + mbr.getId() + ", 비밀번호: " + mbr.getPasswd()
						+ ", 나이: " + mbr.getAge()); // nullㅃㅐ고 출력
		}
		// System.out.println("getMemberList()");

	}

	public static void idAndPw() {
		System.out.println("id 입력: ");
		String memberId = sc.nextLine();
		System.out.println("pw 입력: ");
		String memberPw = sc.nextLine();
		boolean isId = false, isPw = false;
		String name=null;
				int age=0;
		// id, pw 같으면 이름과 나이 출력 pw만 틀리면 패스워드 잘못됐다는 안내문 id, pw 둘 다 틀리면 존재하지 않는다는 안내문
		for (MemberEx mbr : memberArray) {
			if (mbr != null && mbr.getId().equals(memberId)) {
				if (mbr.getPasswd().equals(memberPw)) {
					isId = true; // id, pw 둘 다 맞을 경우
					isPw = true;
					name=mbr.getName();
					age=mbr.getAge();
				} else {
					isId = true; // id만 맞고 pw가 틀릴 경우
					isPw = false;
				}
			} else {
				isId = false; // id만 맞고 pw가 틀릴 경우
				isPw = false;

			}

		}
		if(isId==true && isPw==true)
			System.out.println("이름은 "+name+", 나이는"+age);
		else if(isId==true && isPw==false)
			System.out.println("패스워드가 잘못되었습니다.");
		else if(isId==false && isPw==false) {
			System.out.println("존재하지 않습니다");
		}

	}

// public static MemberEx findMember

}
