package com.yedam.interfacePkg;

public interface RemoteControl {
	//상수 필드
	public static final int MAX_VALUE = 10;
	int MIN_VALUE = 0;
	//추상 메소드
	public abstract void turnOn(); //ab~를 안 적어줘도 에러가 나지 않음
	public void turnOff();
	public void setVolume(int volume);
	
}
