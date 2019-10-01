package com.yedam.exception;

public class NullPointException {
	public static void main(String[] args) {
		String str = null ; //값이 없음, 공란도 아님//"test"; //new String("test");도 가능
		System.out.println(str.toString());
	}

}
