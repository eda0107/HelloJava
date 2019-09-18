package hello;

public class MethodExample {
	public static void main(String[] args) {
		int age = 30;
		double shinchou = 180.9, taizyuu = 68.3;
		System.out.println(args[0]);
		showName();
		showAge(age);
		showMe(shinchou, taizyuu);
		 int result = sum(4, 5);
		// int result = minus(5, 3);
		// int result = multi(3, 2);
		// int result = div(8, 2);
		System.out.println("결과값은 " + result);
		System.out.println(args[1]);
	}


	
	  public static int sum(int a, int b) { return a + b;
	 

	/*
	 * public static int minus(int c, int d) { return c - d;
	 */

	/*
	 * public static int multi(int e, int f) { return e * f;
	 */

	/*
	 * public static int div(int g, int h) { return g / h; }
	 */
	 }
	// }
	// }

	public static void showMe(double shinchou, double taizyuu) {
		System.out.println("I am " + shinchou + "cm and " + taizyuu + "kg");

	}

	public static void showAge(int age) {
		System.out.println("I am " + age + " years old");

	}

	public static void showName() {
		System.out.println("Hello, My name is Dayeon");
	}
}
