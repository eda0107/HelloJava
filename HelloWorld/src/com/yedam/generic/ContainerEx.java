package com.yedam.generic;

public class ContainerEx {
	public static void main(String[] args) {
		
		Container<String> con = new Container<String>();
		con.setObj("Hello");
		String val = con.getObj();
		System.out.println(val);
		
		Container<Integer> con1 = new Container<Integer>();
		con1.setObj(50);
		Integer val1 = con1.getObj();
		System.out.println(val1);
		
	}

}
