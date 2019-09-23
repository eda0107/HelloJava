package hello;

public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton() {} //생성자를 호출 못하도록 막음
	static Singleton getInstance() { //정적 메소드
		return singleton;
		
		
	}
	//리턴타입: 싱글톤
	

}
