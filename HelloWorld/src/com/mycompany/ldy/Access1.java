package com.mycompany.ldy;

class Access2 {
	public Access2() {
		System.out.println("Access2");// 생성자

	}

}

public class Access1 {
	public int field1;
	int field2; 
	private int field3;

	public void method1() { //퍼블릭
		field3 = 10;
		System.out.println("method1");
	}

	void method2() {
		System.out.println(field3);//디폴트 패키지만 동일하면 호출 가능
		System.out.println("method2");
	}

	private void method3() { //프라이빗 클래스 안에서만 호출 가능
		System.out.println("method3");
	}

	public Access1() {
		System.out.println("Access1");// 생성자

	}
}
