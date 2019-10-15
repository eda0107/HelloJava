package com.yedam.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class HighStudent {
	String name;
	String sex;
	int score;

	public HighStudent(String name, String sex, int score) {
		super();
		this.name = name;
		this.sex = sex;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public int getScore() {
		return score;
	}

}

public class PredicateEx {

	static List<HighStudent> list = Arrays.asList(
			new HighStudent("이다연", "남자", 97), 
			new HighStudent("조선아", "여자", 80),
			new HighStudent("김민정", "남자", 70), 
			new HighStudent("김초롱", "여자", 84));

	static double avg(Predicate<HighStudent> pred) {
		boolean bool = false;
		int cnt = 0;
		int sum = 0;
		for (HighStudent student : list) {
			bool = pred.test(student);
			if (bool) { // 해당되는 조건이 참이면
				cnt++;
				sum += student.getScore();
			}
		}
		return (double) sum / cnt;
	}

	public static void main(String[] args) {
		Predicate<HighStudent> pred = new Predicate<HighStudent>() {

			@Override
			public boolean test(HighStudent t) {
				return t.getSex().equals("남자"); //true라면 여자 남자 상관없이 다 계산할 것
			}
			
		};
		double avg = avg(pred);
		System.out.println("남자의 평균값: "+avg);
		
		avg=avg((t) -> {
			return t.getSex().equals("여자");
		});
		
		System.out.println("여자평균: "+avg);
		
	}
}
