package com.yedam.generic;

import java.util.Arrays;

public class CourseEx {

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<>("일반인 과정", 5);
		personCourse.add(new Person("일반인 1"));
		personCourse.add(new Worker("직장인 1"));
		personCourse.add(new Student("학생 1"));
		personCourse.add(new HighStudent("고등학생 1"));

		Course<Worker> workerCourse = new Course<>("직장인 과정", 5);
		workerCourse.add(new Worker("직장인 2"));

		Course<Student> studentCourse = new Course<>("학생 과정", 5);
		studentCourse.add(new Student("학생 3"));
		studentCourse.add(new HighStudent("고등학생 3"));

		Course<HighStudent> highCourse = new Course<>("고등학생 과정", 5);
		highCourse.add(new HighStudent("고등학생 4"));

		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highCourse);

		registerStudent(studentCourse);
		registerStudent(highCourse);

		registerWorker(workerCourse);
		registerWorker(personCourse);

	}

	public static Course<? super Worker> getCourse() { // 리턴 타입이 course 클래스의 아무타입이나 가능
		Course<Person> coursePerson = new Course<>("일반인 과정", 5);
		Course<Worker> courseWorker = new Course<>("직장인 과정", 5);
		Course<Student> courseStudent = new Course<>("학생 과정", 5);
		Course<HighStudent> courseHigh = new Course<>("고등학생 과정", 5);
		return coursePerson;

	}

	public static void registerWorker(Course<? super Worker> course) {
		System.out.println("과정명: " + course.getName() + ", 수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void registerStudent(Course<? extends Student> course) { // student 클래스를 상속받는 클래스가 대상
		System.out.println("과정명: " + course.getName() + ", 수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourse(Course<?> course) {
		System.out.println("과정명: " + course.getName() + ", 수강생: " + Arrays.toString(course.getStudents()));
	}

}
