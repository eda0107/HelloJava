package com.yedam.generic;

public class Course<T> {
	
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) new Object[capacity]; //모든 데이터를 받을 수 있음 new T[capacity]는 에러
		
		
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T[] getStudents() {
		return students;
	}

	public void setStudents(T[] students) {
		this.students = students;
	}
	
	
	
	
	public void add(T t) {
		for(int i=0; i<students.length; i++) {
			if(students[i]==null) {
				students[i]=t;
				break;
			}
		}
	}
	

}
