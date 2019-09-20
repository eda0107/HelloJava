package Classis;

public class Calculator {
	static double pi = 3.14;

	static double minus(double x, double y) {
		return x - y;
	}

	static double plus(double x, double y) { // 밑의 int plus와는 매개값 타입이 달라서 이름이 같아도 괜찮은 것
		return x + y;
	}

	int plus(int x, int y) { // plus는 x,y 값을 갖고
		int result = x + y; // 두 개의 매개값을 받아
		return result; // 합한 것을 리턴
	}

	double avg(int a, int b) {
		int sum = plus(a, b); // 메소드에서 또 다른 메소드를 호출할 수 있음
		double result = sum / 2; // 평균값을 계산
		return result;
	}

	void execute(int c, int d) {
		int a = c, b = d; // 10과 20을 받아서
		double result = avg(a, b); // 평균값을 나타내는 메소드, 메소드는 서로서로 호출이 가능하다
		println("result: " + result);
	}

	void println(String str) {
		System.out.println(str);
	}
}
