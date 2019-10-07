package com.board.model;

import java.util.List;

public interface EmployeeService {

	public List<Employee> getEmpList(); // 전체 리스트를 가지고 오는 메소드

	public Employee getEmployee(int empNo); // 한 건 조회

	public void insertEmployee(Employee emp); // 한 건 입력
	
	public void updateEmployee(Employee emp); //변경
	
	public void deleteEmployee(int empNo); //삭제
	
	
	
	
	
	
	
	
	
	
	

}
