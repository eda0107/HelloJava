package com.yedam.interfacePkg;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(12);
		rc.turnOff();
		System.out.println("============================");
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(12);
		rc.turnOff();

		RemoteControl rc1 = new RemoteControl() { // 클래슨데 이름이 없고 일회용으로만 쓰고 싶은 것
			int volume;

			@Override
			public void turnOn() {
				System.out.println("익명 구현 객체를 켭니다.");

			}

			@Override
			public void turnOff() {
				System.out.println("익명 구현 객체를 끕니다.");

			}

			@Override
			public void setVolume(int volume) {
				this.volume = volume;

			}

		};
		rc1.turnOn();
		rc1.turnOff();
	}
}
