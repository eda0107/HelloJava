package hello;

public class MonthQ {
	public static void main(String[] args) {
		String[] week = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		int month = 8;
		int monthDay = getMonthDay(month);
		int sDay = getStartDay(month);
		// 요일 타이틀 출력

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

	}

	public static int getStartDay(int month) {
		int startDay = 0;
		if (month == 9) {
			startDay = 1; // 일요일
		} else if (month == 10) {
			startDay = 3; // 화요일
		} else if (month == 11) {
			startDay = 6; // 금요일
		} else if (month == 8) {
			startDay = 5;
		}
		return startDay;
	}

	public static int getMonthDay(int month) {
		int day = 0;
		if (month == 2) {
			day = 28;
		} else if (month <= 7 && month % 2 == 1) {
			day = 31;
		} else if (month >= 8 && month % 2 == 0) {
			day = 30;
		}
		return day;
	}

}
