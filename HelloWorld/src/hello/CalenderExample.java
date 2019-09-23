package hello;

import java.util.Calendar;
import java.util.Scanner;

public class CalenderExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력하세요");
		int year=sc.nextInt();
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		getCal(year, month);
	
	}
	
	public static void getCal(int year, int month) {
		Calendar cal = Calendar.getInstance();
		int translatedMonth = month-1;
		cal.set(year, translatedMonth, 8);
		String [] week= {"Sun", "Mon", "Tue",  "Wed", "Thr", "Fri", "Sat"};
	
		int monthDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int sDay = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("    <<"+month+"월달>>"); //요일 타이틀 출력
		for (int i = 0; i < week.length; i++) {
			System.out.print(" " + week[i]);
		}

		System.out.println();
		// 1일의 위치 지정

		for (int i = 1; i<sDay; i++) {
			System.out.printf("%4s","");
		}
		for (int i=1; i<=monthDay; i++) {
			System.out.printf("%4d",i);
			if((sDay+i-1)%7==0)
				System.out.println();
	}
		//for (String str : week) {
		//	System.out.printf("%4s", str);
		//}
		
	
		/*Calendar cal1 = Calendar.getInstance();
		System.out.println("년: "+cal1.get(Calendar.YEAR)); //get ** : **필드를 갖고 오고 싶다
		System.out.println("월: "+cal1.get(Calendar.MONTH)); // 자바는 0이 1월
		System.out.println("요일: "+cal1.get(Calendar.DAY_OF_WEEK)); //월요일은 2, 일요일은 1, 토요일은 7
		System.out.println("일: "+cal1.get(Calendar.DAY_OF_MONTH));
		System.out.println("----------------------------------");
		cal1.set(2019, 0, 1); //2019년 1월 1일
		System.out.println("년: "+cal1.get(Calendar.YEAR));
		System.out.println("월: "+cal1.get(Calendar.MONTH)); 
		System.out.println("요일: "+cal1.get(Calendar.DAY_OF_WEEK)); 
		System.out.println("일: "+cal1.get(Calendar.DAY_OF_MONTH));
		System.out.println("전체일수: "+cal1.getActualMaximum(Calendar.DAY_OF_MONTH));
*/
	}
}
