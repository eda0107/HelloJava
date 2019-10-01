package com.yedam.exception;

public class ArrayIndexOutOfBoundsExceptionEx {
	public static void main(String[] args) {
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("args[0]의 값은: "+data1);
			System.out.println("args[1]의 값은: "+data2);
		} else {
			System.out.println("[실행방법]");
			System.out.println("java ArrayIndexOutOfBoundException 값1 값2");
			//System.out.println("값1 값2");
		}
	}
	

}
