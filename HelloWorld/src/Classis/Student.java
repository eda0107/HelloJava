package Classis;

public class Student {
	// 특성(필드)
	String name;
	String major;
	int studentNum;
	
	//생성자
	Student() {
		
	}
	Student(String name) { //오버로딩
		this.name = name; //this는 객체를 가르킴 매개변수와 구분하기 위해서 사용
	}
	
	Student(String name, String major) {
		this.name = name;
		this.major = major;
	}
	
	// 기능(메소드)
	void study() {
		System.out.println("공부합니다");
	}
	
	void goToSchool() {
		System.out.println("학교갑니다");
		
	}
	

}
