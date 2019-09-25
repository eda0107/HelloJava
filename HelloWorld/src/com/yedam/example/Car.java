package com.yedam.example;

public class Car {
	Tire frontLeft = new Tire("왼 앞", 6); // 필드 선언; 필드값이 클래스로도 올 수 있음
	Tire frontRight = new Tire("오 앞", 2);
	Tire backLeft = new Tire("왼 뒷", 3);
	Tire backRight = new Tire("오 뒷", 4);

	int run() {
		System.out.println("[자동차가 달립니다]");
		if (frontLeft.roll() == false) { // false=펑크났다
			stop();
			return 1; // 왼쪽 앞 바퀴에 문제 발생 시, 1을 보내겠다
		} else if (frontRight.roll() == false) {
			stop();
			return 2;
		} else if (backLeft.roll() == false) {
			stop();
			return 3;
		} else if (backRight.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}

	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
