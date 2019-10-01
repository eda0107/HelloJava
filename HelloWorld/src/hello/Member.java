package hello;

public class Member {
	
	private String name;
	private String id;
	private String passwd;
	private int age;

	public Member() { // default 생성자
	}

	public Member(String name, String id) { 
		this.name = name; //각자 생성자 지정
		this.id = id;
	}
	
	public Member(String name, String id, String passwd, int age) { 
		this.name = name; //각자 생성자 지정
		this.id = id;
		this.passwd=passwd;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
