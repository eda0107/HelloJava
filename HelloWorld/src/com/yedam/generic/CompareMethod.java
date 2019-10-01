package com.yedam.generic;

public class CompareMethod {

	public static void main(String[] args) {
		Pair<String, Integer> p1 = new Pair<>("apple", 50); // p1과 p2의 객체주소는 다름
		Pair<String, Integer> p2 = new Pair<>("apple", 50);
		boolean result = Util.compare(p1, p2); // Compare 메소드는 제너릭 타입의 매개값을 받음
		if (result)
			System.out.println("두 객체가 논리적으로 동일");
		else
			System.out.println("두 객체가 논리적으로 동일하지 않음");

		Pair<Integer, Integer> s1 = new Pair<>(617, 3104);
		Pair<Integer, Integer> s2 = new Pair<>(617, 1116);
		boolean result1 = Util.compare(p1, p2);
		if (result1)
			System.out.println("두 객체가 동일");
		else
			System.out.println("두 객체가 동일하지 않음");

		Pair<String, Integer> x1 = new Pair<>("orange", 10);
		Pair<String, Integer> x2 = new Pair<>("apple", 10);
		boolean result2 = Util.compareValue(x1, x2);
		if (result2)
			System.out.println("Int 객체가 동일");
		else
			System.out.println("Int 객체가 동일하지 않음");

//		("user1", "orange");
//		("user1", "orange");
//		

	Integer intV1 = Util.compare(12.3,  2.3);
	System.out.println(intV1);
		
		
	}

}
