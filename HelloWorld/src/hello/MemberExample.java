package hello;

import java.util.Scanner;

public class MemberExample {

	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setName("이다연");
		m1.setId("leedy");
		m1.setPasswd("leedy17");
		m1.setAge(25);

		Member m2 = new Member("관리자", "admin");
		m2.setPasswd("admin123");
		m2.setAge(25);

		Member m3 = new Member("사용자1", "user1", "user123", 10);

		Member[] memberAry = { m1, m2, m3 };
		Scanner sc=new Scanner(System.in);
		System.out.println("조회할 이름은?");
		String name=sc.nextLine();
		for (Member m : memberAry) {
			if(m.getName().equals(name))
			System.out.println("=> name: " + m.getName() + ", id: " + m.getId() + ", passwd: " + m.getPasswd() + ", age: "
					+ m.getAge());
		}
	}

}
