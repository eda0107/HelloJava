package com.yedam.lamda;

import java.util.function.IntBinaryOperator;

class Calculator {
	static int staticSum(int x, int y) {
		return x + y;
	}

	int instanceSum(int x, int y) {
		return x + y;
	}
}

public class MethodReferenceEx {
	public static void main(String[] args) {
		int a = 10, b = 20;
		int result = 0;
		Calculator.staticSum(a, b); // 클래스 이름으로 메소드를 사용

		Calculator cal = new Calculator();
		cal.instanceSum(a, b); // instanceSum 메소드를 사용하려면 인스턴스화 시켜줘야함

		IntBinaryOperator oper;
		
		oper = (x,y) -> {
			return Calculator.staticSum(x, y);
		};
		result = oper.applyAsInt(a, b);
		System.out.println("정적 메소드 참조 1: "+result);
		
		oper = Calculator::staticSum; // ::의 의미는? 메소드를 참조하겠다 매개값을 두 개 받아서 처리하겠다
		result = oper.applyAsInt(a, b); //static 메소드
		System.out.println("정적 메소드 참조2: " + result);
		
		System.out.println("===================================");
		
		oper = cal::instanceSum; //instance 메소드
		result = oper.applyAsInt(b, a);
		System.out.println("인스턴스 메소드 참조: " + result);
	}

}
