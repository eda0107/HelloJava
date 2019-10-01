package com.yedam.generic;

class Tv {

}

public class ProductEx {

	public static void main(String[] args) {

		Product<String, Integer> prd1 = new Product<>();
		prd1.setTea("책상");
		prd1.setModel(10);

		System.out.println(prd1.getTea() + ", " + prd1.getModel());
		
		Product<Tv, String> prd2 = new Product<>();
		prd2.setTea(new Tv());
		prd2.setModel("스마트Tv");
		Tv tv = prd2.getTea();
		String str = prd2.getModel();

		
	
	
	}

}
