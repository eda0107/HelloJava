package com.yedam;

class Parent {

	void method1() {
		System.out.println("부모클래스의 메소드 1");
	}

	void method2() {
		System.out.println("부모클래스의 메소드 2");
	}

}

class Child extends Parent {

	@Override
	void method1() {
		System.out.println("자식클래스의 메소드 1");
	}

	@Override
	void method2() {
		System.out.println("자식클래스의 메소드 2");
	}

	void method3() {
		System.out.println("자식클래스의 메소드 3");
	}
}

public class ParentExample {
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.method1();
		c1.method2();
		c1.method3();

		Parent p1 = c1; //p1타입으로 *형변환*이 일어난 것
		p1.method1(); //'자식클래스의 메소드1'이라는 값이 나옴
		p1.method2(); //'자식클래스의 메소드2'라는 값이 나옴, method3를 요구하면 에러가 뜸
		
		c1 = (Child) p1;
		c1.method1(); //가능해짐 (p1값을 다시 c1에 대입)
		c1.method2();
		c1.method3();
		
		Parent p2=new Parent();
		p2.method1(); //'부모클래스의 메소드1'이라는 값이 나옴
		p2.method2(); //'부모클래스의 메소드2'라는 값이 나옴
		
		if(p2 instanceof Child) {
			c1 = (Child) p2; //컴파일 오류는 없지만 실행이 안됨
			c1.method1();
			c1.method2();
			c1.method3();
		}
		
		
		
	}

}
