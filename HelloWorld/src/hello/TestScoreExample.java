package hello;

import java.util.Scanner;

public class TestScoreExample {
	private static TestScore[] tsAry = new TestScore[10];
	private static Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
boolean run = true;
		while (true) {
			System.out.println("메뉴 선택");
			System.out.println("1. 성적 등록 2. 전체 리스트 3. 학생 번호 조회 4. 통계 5. 정렬 6. 종료");
			int a = sc.nextInt();
			sc.nextLine();
			if (a == 1) {
				writeScore();
			} else if (a == 2) {
				getScoreList();
			} else if(a == 3) {
				studentNo();
			} else if (a == 4) {
				seeChart();
			} else if( a == 5) {
				studentAry
			} else if ( a== 6) {
				run = false;
			}
			
		}
		System.out.println("종료");
	}

	public static void writeScore() {
		System.out.println("학생 번호 입력");
		int studentNo = sc.nextInt();
		System.out.println("학생 이름 입력");
		String studentName = sc.nextLine();
		System.out.println("국어 성적 입력");
		int koreanScore = sc.nextInt();
		System.out.println("영어 성적 입력");
		int englishScore = sc.nextInt();
		System.out.println("수학 성적 입력");
		int mathScore = sc.nextInt();

		TestScore test = new TestScore(studentNo, studentName, koreanScore, englishScore, mathScore);
		for (int i = 0; i < tsAry.length; i++) {
			if (tsAry[i] == null) {
				tsAry[i] = test;
				break;
			}
		}

	}

	public static void getScoreList() {
		System.out.println("전체 리스트 조회");
		for (TestScore test : tsAry) {
			if (test != null) {
				System.out.println("학생 번호: " + test.getNumber() + ", 이름: " + test.getName() + ", 국어 점수: "
						+ test.getKorean() + ", 영어 점수: " + test.getEnglish() + ", 수학 점수: " + test.getMath());
			}
		}

	}

	public static void studentNo() {
		int sum = 0;
		int avg = 0;
		
		System.out.println("학생 번호 조회");
		System.out.println("학생 번호 입력: ");
		int studentNo = sc.nextInt();
		for (int test = 0; test < tsAry.length; test++) {
			if (tsAry[1] != null && tsAry[test].getNumber() == studentNo) {
				System.out.println(tsAry[test].getKorean() + tsAry[test].getEnglish() + tsAry[test].getMath());
				sum = tsAry[test].getKorean() + tsAry[test].getEnglish() + tsAry[test].getMath();
				avg = (tsAry[test].getKorean() + tsAry[test].getEnglish() + tsAry[test].getMath())/3;
			}

		}
		
		System.out.println("총점: " + sum );
		System.out.println("평균: " + avg);
	}

	public static void seeChart() {
		int sum = 0;
		int avg = 0;
		


	}

	public static void studentAry() {

	}
}
