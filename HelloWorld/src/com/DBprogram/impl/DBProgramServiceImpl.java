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
	public List<DBProgram> getEmpList() {
		
		return dao.getEmpList();
	}

	@Override
	public List<DBProgram> getDeptList() {
		
		return null;
	}

	@Override
	public void updateEmployee(DBProgram emp) {
		
		
	}

	@Override
	public void deleteEmployee(DBProgram emp) {
	
		
	}
	
	

}
