package com.DBprogram.model;

import java.util.List;

public interface DBProgramService {
	
	public void insertEmployee(DBProgram emp);
	//사원 등록
	
	public List<DBProgram> getEmpList();
	//사원 이름 조회(리스트)
	
	public List<DBProgram> getDeptList();
	//부서별 조회
	
	public void updateEmployee(DBProgram emp);
    //부서 변경
	
	public void deleteEmployee(DBProgram emp);
	//퇴사 처리



}
