package com.bambooJohn.mapper;

import java.util.List;

import com.bambooJohn.bean.Emp;

public interface EmpMapper {

	public List<Emp> getAllEmps();
	
	public Emp getEmpByEid(String eid);
	
	public void addEmp(Emp emp);
	
	public void deleteEmp(String eid);
	
	public void updateEmp(Emp emp);
	
}
