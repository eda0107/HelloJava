package Classis;//클래스의 멤버: 메소드, 생성자, 필드

public class CalcuExample {
public static void main(String[] args) { //static이 붙는 메소드는 인스턴스를 안 만들어도 쓸 수 있다.
	Calculator.cal=new Calculator;
			cal.excute();// = new Calculator(); //cal=인스턴수 변수: new를 통해서 실체가 하나 만들어짐
	//cal 변수를 통해서 new Calculator 주소로 갈 수 있음
	//cal.execute(4,1); 
	}
}
	//Scanner sc = new 
			//void execute (int c, int d);
	//for (int i=0; i<c; i++) {
	//	System.out.println(execute);
	//}
	
//}

