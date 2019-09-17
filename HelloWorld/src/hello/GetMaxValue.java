package hello;

import java.util.Scanner;

public class GetMaxValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] aAry = new int [5];
		
		for(int i = 0; i < aAry.length; i++) {
			System.out.println("정수 나타내기");
			aAry[i]=sc.nextInt();
		}
		int maxV = 0;
		for (int i = 0; i < aAry.length; i++) {
			maxV = (maxV > aAry[i]? maxV :aAry[i]);
			
		}
	
		System.out.println("제일 큰 값은 " + maxV);
		
	}
		
				
	

}
