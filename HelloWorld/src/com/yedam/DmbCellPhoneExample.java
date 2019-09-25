package com.yedam;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmbCell = new DmbCellPhone ("S10", "white", 10);
		System.out.println("model: "+dmbCell.model); //부모의 필드
		System.out.println("color: "+dmbCell.color); //부모의 필드
		System.out.println("channel: "+dmbCell.channel); //자신의 필드
		dmbCell.powerOn();//부모 메소드
		dmbCell.turnOnDmb();//자신 메소드
		dmbCell.turnOffDmb();
		dmbCell.powerOff();
		
		
	}
	
	
}
