package com.yedam.example2;

import com.yedam.example.Tire;

public class Car {

	
	Tire [] tireAry = {new Tire("앞 왼",6), new Tire("앞 오", 2), 
			new Tire("왼 뒷", 3), new Tire("오 뒷", 4)};
	int run() {
		System.out.println("[자동차가 달립니다]");
		for(int i=0; i<tireAry.length; i++) {
			if(tireAry[i].roll()==false) {
				stop();
				return i+1;
			}
			
		}
	return 0;
	
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
	
	
}

	

			
	

