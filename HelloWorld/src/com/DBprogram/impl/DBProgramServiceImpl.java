package com.DBprogram.impl;

import java.util.List;

import com.DBprogram.model.DBProgram;
import com.DBprogram.model.DBProgramService;

public class DBProgramServiceImpl implements DBProgramService {

	DBProgramDAO dao = new DBProgramDAO();

	@Override
	public void insertEmployee(DBProgram emp) {
		dao.insertEmployee(emp);

	}

	@Override
	public List<DBProgram> getEmpList(String employeeName)
	{
		return dao.getEmpList(employeeName);

	}

	@Override
	public List<DBProgram> getDeptList(String deptName) {

		return dao.getDeptList(deptName);
	}

	@Override
	public void updateEmployee(DBProgram emp) {

	}

	@Override
	public void deleteEmployee(DBProgram emp) {
		dao.deleteEmployee(emp);
		System.out.println("사원이 삭제되었습니다.");

	}

}
