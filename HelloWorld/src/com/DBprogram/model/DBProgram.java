package com.DBprogram.model;

public class DBProgram {

	private int employeeNo;
	private String employeeName;
	private String deptNo;
	private int salary;
	private String hireDate;

	public DBProgram(int employeeNo, String employeeName, String deptNo, int salary, String hireDate) {
		super();
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.deptNo = deptNo;
		this.salary = salary;
		this.hireDate = hireDate;
	}

	public DBProgram() {
		
	}

	public int getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

}
