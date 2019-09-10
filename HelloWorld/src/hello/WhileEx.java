package hello;

public class WhileEx {
	public static void main(String[] args) {
		//4단 출력
		int i = 1;
		while(true) {
			System.out.println(4+"*"+i+"="+(4*i));
			if(i==9) break;
			i++;
		}
	}

}
