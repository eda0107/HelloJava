package Classis;

public class Member {

	
	private String id;
	private String name;
	private String course;
	
	
	public Member(String memberNo, String memberName, String courseName) {
		
		this.id = memberNo;
		this.name = memberName;
		this.course = courseName;
	}



	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}
	
	
}
