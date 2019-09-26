package com.yedam;

class Driver {
	void drive(Vehicle vehicle) {
		vehicle.run();
	}
}

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle vehicle = new Vehicle();
		vehicle = new Bus();
		vehicle = new Taxi(); //동일한 매개값이지만 인스턴스를 뭘로 갖느냐에 따라 결과값이 그때그때 달라짐 (=다형성)
		
		
		driver.drive(vehicle); //매개값이 어떤 인스턴스인지 보고 활용할 것

	}
}
