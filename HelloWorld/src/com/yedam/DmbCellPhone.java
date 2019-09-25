package com.yedam;

public class DmbCellPhone extends CellPhone { // 부모 클래스가 CellPhone이 됨
	int channel;

	public DmbCellPhone(int channel) {
		super(); // super: 부모 클래스 생성자->CellPhone
		this.channel = channel;
	}

	public DmbCellPhone() {
		super();
	}

	public DmbCellPhone(String model, String color, int channel) { // 자식 클래스; 생성자를 호출하겠다
		super(model, color); // 부모를 한 번 호출하고 model하고 color에 담겠다
		this.channel = channel;
	}

	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 방송 수신을 시작합니다.");
	}

	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널 "+channel+"번으로 변경합니다.");
	}
	
	void turnOffDmb () {
		System.out.println("DBM 방송을 종료합니다.");
	}

}
