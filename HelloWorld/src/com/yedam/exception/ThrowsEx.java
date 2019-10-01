package com.yedam.exception;

public class ThrowsEx {
	public static void main(String[] args) {

		try {
			findClass();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); //에러 내용을 상세하게 보여달라
		}
		System.out.println("findClass() 호출 후");

	}

	public static void findClass() throws ClassNotFoundException {
		Class clazz = null;
		clazz = Class.forName("java.lang.String2");
		System.out.println(clazz.getName());

		// System.out.println(clazz.getName());
	}
}
    