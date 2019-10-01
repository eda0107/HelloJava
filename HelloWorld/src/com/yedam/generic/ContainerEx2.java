package com.yedam.generic;

public class ContainerEx2 {
	
	public static void main(String[] args) {
		
		Container2<String, String> con2 = new Container2 <>("홍길동","도적");
		String name1 = con2.getKey();
		String job = con2.getValue();
		System.out.println("이름은 " +name1+" 직업은 "+job);
		
		Container2<String, Integer> con3 = new Container2<>("홍길동", 35);
		String name2 = con3.getKey();
		int age = con3.getValue();
		System.out.println("이름은 " +name2+" 직업은 "+age);
		
	}

}
