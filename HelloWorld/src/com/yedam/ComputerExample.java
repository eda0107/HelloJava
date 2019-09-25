package com.yedam;

class Calculator {
	double areaCircle(double r) {
		return 3.14 * r * r;
	}
}

class Computer extends Calculator {
	@Override
	double areaCircle(double r) { // 부모의 메소드 타입과 같아야함 int가 올 경우 에러가 남<-Override 때문에 부모 것을 받아 정의하겠다. 라는 의미
		return Math.PI * r * r;
	}

	double areaCircle1(double r) {
		return super.areaCircle(r);
	}
}

public class ComputerExample {
	public static void main(String[] args) {
		Computer com = new Computer();
		System.out.println("결과값: "+com.areaCircle(10));

	}

}
