package hello;

public class Qone {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '/';
		int result = 0;

		switch(operator) {
		case '+' :
		result = num1+num2;
		break;

		case '-' :
		result = num1-num2;
		break;
		
		case '*' :
			result = num1*num2;
			break;
			
		case '/' :
			result = num1/num2;
			break;
			
			default:
				
				
		}
		
		System.out.println("num1과 num2는 " + "num1" + operator + "num2 가 되어 "+result+"가 출력됩니다." );
		
		
	}

}
