package com.yedam.lamda;

interface MyLocalInterface {
	public void method();
}

public class UsingLocalVariable {
	void method(int arg) {
		int localVal = 0;
		arg = 20;
		localVal = 20;
		
		
		MyLocalInterface lif = () -> {
			// localVal = 20;
//			System.out.println(arg);
//			System.out.println(localVal);
		};
	}

}
