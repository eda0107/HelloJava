package com.yedam.lamda;

@FunctionalInterface
interface MyInterface { // 인터페이스 중에 구현해야할 메소드가 하나만 있을 때(->functional Interface) 그 메소드가 람다식(표현식)의 대상이 됨

	int print(int a, int b);
}

//class MyInterfaceClass implements MyInterface {
//
//	@Override
//	public int print(int a, int b) { // interface의 자료형, 변수 이름이 다 같아야함
//		return a + b;
//	}

//}

public class LambdaBasicEx {

	public static void main(String[] args) { // MyInterfaceClass 라는 이름을 갖고 있음(기존 방법)
//		MyInterface mi = new MyInterfaceClass();
//		int rs = mi.print(4, 9);
//		System.out.println("결과값은 " + rs);

		MyInterface mi = // 익명의 구현 객체를 만들겠다(람다식을 사용하겠다)

				(a, b) -> {
					return a * b;
				}

		;
		int rs = mi.print(3, 5);
		System.out.println("결과값은 " + rs);

		mi = (c, d) -> {
			return c - d;
		};

		rs = mi.print(7, 4);
		System.out.println("결과값은 " + rs);
		
		mi = (e, f) -> {
			return e/f;
		};
		
		rs=mi.print(9, 3);
		System.out.println("결과값은 "+rs);

	}
}
