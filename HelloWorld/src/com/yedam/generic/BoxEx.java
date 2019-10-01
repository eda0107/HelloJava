package com.yedam.generic;

public class BoxEx {
	public static void main(String[] args) {
		
		
		Box<String> box = new Box<String>(); //사용하는 시점에서 box 변수의 데이터 타입을 String으로 정해줬기 때문에
		box.setObj(new String("hello")); //String 이외의 객체는 만들 수 없음
		String str = box.getObj();
		
		Box<Integer> intBox = new Box<Integer>(); //사용하는 시점에서 intBox 변수의 데이터 타입을 Integer로 정해줌
		intBox.setObj(10);
		int intValue = intBox.getObj(); //컴파일 하는 시점에 체크해주고, 형변환도 하지 않음
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Box box = new Box();
//		
//		box.setObj(new String("hello")); // 오브젝트를 상속하기 때문에 어떤 타입의 매개값이든 올 수 있음
//		String srtValue = (String) box.getObj(); // 형변환을 해줘야함: 형변환이 많을 수록 성능이 떨어짐
//		System.out.println(srtValue);
//		
//		box.setObj(new Integer(10));
//		int intvalue = (int) box.getObj(); // 형변환을 해줘야함
//		System.out.println(intvalue);
//		
//		box.setObj(new Double(1.1));
//		String newStr = (String) box.getObj(); //double 타입을 String 타입으로 cast 할 수 없다(변환 X)
//	
	}

}
