package hello;

public class TestScore {
	
	
	private int number;
	private String name;
	private int korean;
	private int english;
	private int math;
//	private int sum;
	//private int avg;
	

	public TestScore(int studentNo, String studentName, int koreanScore, int englishScore, int mathScore) {
	
		this.number = studentNo;
		this.name = studentName;
		this.korean = koreanScore;
		this.english = englishScore;
		this.math = mathScore;
	//	this.sum = sum;
		//this.avg = avg;
	}

	

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	
	
}

