package com.yedam.exception;

public class TryCactchFinallyEx {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;

		try {
			data1 = args[0];
			data2 = args[1];
			System.out.println("data1" + data1);
			System.out.println("data2" + data2);

			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			System.out.println("sum: " + (val1 + val2));

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개 변수의 값이 부족합니다");
			System.out.println("매개 변수 2개가 필요합니다");
		} catch (NumberFormatException e) {
			System.out.println("실행 매개 변수의 값이 부족합니다");
			System.out.println("매개 변수 2개가 필요합니다");
		} finally {
			System.out.println("다시 실행하세요");
		}

		System.out.println("프로그램 종료");
	}
}
