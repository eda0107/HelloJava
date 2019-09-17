package hello;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		int a, b, result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 값을 입력");
		a = sc.nextInt();
		System.out.println("두번째 값을 입력");
		b = sc.nextInt();
		
		//if (a>b)
		//	result = a;
		//else
		//	result = b;
		
		result = (a>b?a:b);
		System.out.println("두 수 중에서 큰 수를 출력: "+result);
		
	
				}
			
	}


