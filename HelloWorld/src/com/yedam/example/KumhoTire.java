package com.yedam.example;

public class KumhoTire extends Tire {
	
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		this.accumulatedRotation++;
		if (maxRotation > accumulatedRotation) {
			System.out.println(location + "Kumho 타이어 수명은 " + (maxRotation - accumulatedRotation) + "회 남아있습니다.");
			return true;

		} else { // max=accmulated가 같을 때
			System.out.println("***" + location + "Kumho 타이어가 펑크났습니다.");
			return false;
		}
	}

}
