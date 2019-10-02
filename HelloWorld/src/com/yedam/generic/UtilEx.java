package com.yedam.generic;

public class UtilEx {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(age);

		Pair<Integer, String> pair2 = new Pair<>(10, "홍길동");
		String returnVal = Util.getValue(pair2, 10);
		System.out.println(returnVal);
		
		
	}
} 
