package com.yedam.lamda;

interface MyInterfaceNoArgs {
	public void method1();

}

interface MyInterfaceWithArgs {
	public void method2(int a);
}

interface MyInterfaceWithReturn {
	public int method3(int a, int b);

}

public class LambdaBasicEx2 {
	public static void main(String[] args) {
		MyInterfaceNoArgs fina = () -> { // ()은 매개값이 없다는 표현
			System.out.println("no arguments expression");
		};
		fina.method1();

		MyInterfaceWithArgs fiwa = (a) -> { // 매개값은 하나, 리턴타입은 X
			System.out.println("result is " + a * 3);
		};

		fiwa.method2(5);

		MyInterfaceWithReturn figa = (a, b) -> {
			return a + b;
		};
		int result = figa.method3(8, 5); // 리턴값이 있으니 자료형
		System.out.println("결과값은 " + result);
	}

}
