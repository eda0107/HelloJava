package com.yedam.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		// List 인터페이스를 구현하는 ArrayList 클래스
		List<String> list = new ArrayList<>(); // 생성자

		list.add("Hello"); // 첫번재 인덱스 값에 hello가 들어감
		list.add("World");
		list.add("Nice");
		list.add("Java");
		list.add(2, "Insert"); // 인덱스 2 자리에 값 담기

		int size = list.size(); // list에 담겨진 객체 수
		System.out.println("객체 수는 " + size);

		for (int i = 0; i < size; i++) {
			System.out.println(list.get(i));
		}

		String returnVal = list.remove(2);
		System.out.println("==========");
		for (String str : list) {
			System.out.println(str);

//			size = list.size();
//			for (int i = 0; i < size; i++) {
//				System.out.println(list.get(i));
			//}

		}
	}
}
