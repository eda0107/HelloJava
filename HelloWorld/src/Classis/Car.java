package Classis;

public class Car {
	//특성(=필드, 클래스 멤버)
	String model;
	String color;
	int price;
	int maxSpeed;
	
	//기능(=메소드)
	void drive() {
		System.out.println(model+" 현재 최고 속도는 " + maxSpeed);
		
	}

	void stop() {
		System.out.println("멈춥니다");
	}
	
	void accelerate() {
		
	}

}
