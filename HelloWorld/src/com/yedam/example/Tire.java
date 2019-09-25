package com.yedam.example;

public class Tire {

	int maxRotation; // 사용가능한 최대 회전 수
	int accumulatedRotation; // 사용 후 축적된 회전 수 max=accumulate가 된다면 타이어를 갈아끼워야 함
	String location;

	Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;

	}

	boolean roll() {
		accumulatedRotation++;
		if (maxRotation > accumulatedRotation) {
			System.out.println(location + "타이어 수명은 " + (maxRotation - accumulatedRotation) + "회 남아있습니다.");
			return true;

		} else { //max=accmulated가 같을 때
			System.out.println("***" + location + "타이어가 펑크났습니다.");
			return false;

		}
	}
}
