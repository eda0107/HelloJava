package Classis;

public class CarExample {
	public static void main(String[] args) {
		
		Car car = new Car(); //인스턴스를 만드는 것 변수 선언 int a 어쩌구랑 비슷 
		//Car 클래스 타입의 변수 car .을 찍어야 메소드, 속성들을 사용할 수 있음
		car.model = "그랜저";
		car.color = "red";
		car.price = 1000;
		car.maxSpeed = 200;
		
		System.out.println(car); //변수 이름만 적으면 주소가, 변수.필드를 적어줘야 값이 나옴
		System.out.println(car.model);
		System.out.println(car.color);
		System.out.println(car.price);
		System.out.println(car.maxSpeed);
		//car.drive();
		
		Car car2 = new Car();
		int [] intAry = new int[5];
		Car [] carAry = new Car[2];
		String [] strAry = null;
		
		car2.model = "소나타";
		car2.color = "black";
		car2.price = 1500;
		car2.maxSpeed = 250;
		//car2.drive();
		
		System.out.println(car2);
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.price);
		System.out.println(car2.maxSpeed);
		
		
		carAry [0] = car;
		carAry [1] = car2;
		
		for(Car c:carAry) {
			System.out.println(c.model+","+c.color);
			
		}
	}
	

}
