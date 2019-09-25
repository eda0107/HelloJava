package com.yedam;

public class CellPhone { //부모 클래스를 만드는 중
	String model;
	String color;
	
	
	
	public CellPhone() { //디폴트 생성자
		super(); //super? -> 모든 자바의 최상위(부모) 클래스; object 그렇기 때문에 super () 을 써서 object 호출?
	
	}

	public CellPhone(String model, String color) { //전체 생성자
		super();
		this.model = model;
		this.color = color;
	}
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	void bell() {
		System.out.println("벨을 울립니다.");
	}
	void hangUp () {
		System.out.println("전화를 끊습니다.");
	}
	
	

}
