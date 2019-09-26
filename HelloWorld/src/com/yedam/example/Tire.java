package com.yedam.example;

public class Tire {

	int maxRotation; // 사용가능한 최대 회전 수 (변수 아니고 필드임: 데이터를 저장하는 곳)
	int accumulatedRotation; // 사용 후 축적된 회전 수 max=accumulate가 된다면 타이어를 갈아끼워야 함
	String location;

	public Tire(String location, int maxRotation) { //생성자: 객체 생성할 때 초깃값을 주는 것
		this.location = location;
		this.maxRotation = maxRotation;

	}

	public boolean roll() { //메소드
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
