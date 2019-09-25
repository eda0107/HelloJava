package com.yedam.example;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		for (int i = 0; i < 10; i++) {
			int problemLocation = car.run();
			switch (problemLocation) {
			case 1:
				System.out.println("왼 앞, Hankook 타이어로 교체");
				car.frontLeft = new HankookTire("왼 앞", 15);
				break;
			case 2:
				System.out.println("오 앞, Kunhp 타이어로 교체");
				car.frontRight = new KumhoTire("오 앞", 17);
				break;
			case 3:
				System.out.println("왼 뒤, Hankook 타이어로 교체");
				car.backLeft = new HankookTire("왼 뒤", 16);
				break;
			case 4:
				System.out.println("오 뒤, Kumho 타이어로 교체");
				car.backRight = new KumhoTire("오 뒤", 15);
				break;
			}
			System.out.println("============================");
		}
	}

}
