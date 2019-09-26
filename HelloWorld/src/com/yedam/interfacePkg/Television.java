package com.yedam.interfacePkg;

public class Television implements RemoteControl {
	int volume; //필드(속성, 멤버변수)

	@Override
	public void turnOn() {
		System.out.println("텔레비전을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("텔레비전을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
	//	System.out.println("텔레비전의 볼륨을 " + volume + "(으)로 설정합니다.");
	}

}
