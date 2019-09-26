package com.yedam.example;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override //리모델링의 의미(명의 변경)
	public boolean roll() {
		this.accumulatedRotation++;
		if (maxRotation > accumulatedRotation) {
			System.out.println(location + "Hankook 타이어 수명은 " + (maxRotation - accumulatedRotation) + "회 남아있습니다.");
			return true;

		} else { // max=accmulated가 같을 때
			System.out.println("***" + location + "Hankook 타이어가 펑크났습니다.");
			return false;
		}
	}
}
