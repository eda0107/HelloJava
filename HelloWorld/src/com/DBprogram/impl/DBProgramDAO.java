package com.DBprogram.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.DBprogram.common.DAO;
import com.DBprogram.model.DBProgram;

public class DBProgramDAO {

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public List<DBProgram> getDeptList(String deptName) {
		DBProgram emp;
		conn = DAO.getConnect();
		String sql = "select * from employee where department_id = '?'";
		List<DBProgram> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, deptName);
			rs = pstmt.executeQuery();

			while(rs.next()) {
				emp = new DBProgram();
				emp.setEmployeeNo(rs.getInt("employee_no"));
				emp.setEmployeeName(rs.getString("employee_name"));
				emp.setDeptNo(rs.getString("department_id"));
				emp.setSalary(rs.getInt("salary"));
				emp.setHireDate(rs.getString("hire_date"));
				list.add(emp);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return list;
	}
	
	public void deleteEmployee(DBProgram emp) {
		conn = DAO.getConnect();
		String sql = "delete from employee where employee_no = ?";
		try {
			int r = 0;
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmployeeNo());
			r = pstmt.executeUpdate();
			System.out.println(r + "건이 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public List<DBProgram> getEmpList(String employeeName) {
		DBProgram emp;
		conn = DAO.getConnect();
		String sql = "select * from employee where employee_name = ?";
		List<DBProgram> list = new ArrayList<>();

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, employeeName);
			rs = pstmt.executeQuery();

			while(rs.next()) {
				emp = new DBProgram();
				emp.setEmployeeNo(rs.getInt("employee_no"));
				emp.setEmployeeName(rs.getString("employee_name"));
				emp.setDeptNo(rs.getString("department_id"));
				emp.setSalary(rs.getInt("salary"));
				emp.setHireDate(rs.getString("hire_date"));
				list.add(emp);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return list;

	}

	public void insertEmployee(DBProgram emp) {
		conn = DAO.getConnect();
		String sql = "insert into employee values(employeess.nextval,?,?,?,?)";

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, emp.getEmployeeName());
			pstmt.setString(2, emp.getDeptNo());
			pstmt.setInt(3, emp.getSalary());
			pstmt.setString(4, emp.getHireDate());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 입력되었습니다.");
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
