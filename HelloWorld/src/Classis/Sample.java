package Classis;

import java.util.Scanner;

public class Sample {

	// for (i=0; i<perAry.length; i++) {
	// System.out.println(perAry[i]);
	// }

	// perAry += 1;

	// Scanner sc = new Scanner(System.in)
	// i = sc.nextInt()
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("금액은?");
	int Money=scanner.nextInt();
		
		//int Money = 567580;
		int[] perAry = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		for (int i = 0; i < perAry.length; i++) {
			int x = Money / perAry[i];
			int y = Money % perAry[i];
			Money = y;
			System.out.println(perAry[i]+","+x);
		}

		/*
		 * System.out.println("오만 원은" + Money/perAry[0] ); System.out.println("만 원은 " +
		 * Money%perAry[0]/perAry[1]); System.out.println("오천 원은 " +
		 * Money%perAry[1]/perAry[2]); System.out.println("천 원은" +
		 * Money%perAry[2]/perAry[3]); System.out.println("오백 원은 " +
		 * Money%perAry[3]/perAry[4]); System.out.println("백 원은 " +
		 * Money%perAry[4]/perAry[5]); System.out.println("오십 원은 " +
		 * Money%perAry[5]/perAry[6]); System.out.println("십 원은 " +
		 * Money%perAry[6]/perAry[7]);
		 */
	}

}
