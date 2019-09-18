package hello;

public class MethodExample3 {

	public static void main(String[] args) {
		Pal(5, 7);
		
	}

	public static void Pal(int a, int b) {
		//int c = 1;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.printf("*");
			}
			System.out.println("");
		}

	}

}
