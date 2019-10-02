package com.yedam.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		Set<Member> memSet = new HashSet<>();

		
		
		memSet.add(new Member("홍길동",30));
		memSet.add(new Member("이길동",30));
		System.out.println("memSet의 객체 수는 "+memSet.size());
		for(Member m : memSet) {
			System.out.println(m.name+ "/"+m.age);
			
		}
		
		
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World");
		set.add("Nice");
		set.add("Java");
		set.add("World");
		System.out.println("객체 수는 "+set.size()); //실행하면 4가출력: 중복된 값 허용 X
		
		set.iterator();
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) { //읽을 값이 있느냐? 체크하는 메소드
			System.out.println(iter.next()); //반복자 한 개를 읽어와서 리턴
		}
		
		System.out.println("반복자 소진 후");
		iter = set.iterator(); //다시 한 번 선언해야 함
		while(iter.hasNext()) { 
			System.out.println(iter.next()); 
		}
		set.remove("Nice");
		System.out.println("확장 for");
		for(String str : set) {
			System.out.println(str);
		}
		
	}
}
