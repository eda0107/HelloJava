package Classis;

public class StudentExample {
	public static void main(String[] args) {
		Student st1 = new Student();
		st1.name = "hong";
		st1.major = "history";
		st1.studentNum = 1111;
		System.out.println(st1.name+", "+st1.major+", "+st1.studentNum);
	//필드에다가 직접 값을 넣은 것
		
		Student st2=new Student("kim", "math");
		st2.studentNum =2222;
		System.out.println(st2.name+", "+st2.major+", "+st2.studentNum);
	//생성자를 통해 값을 입력한 것
		
	}
	

}
