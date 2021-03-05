package com.bambooJohn.ssm.service;

import java.util.List;

import com.bambooJohn.ssm.bean.Dept;
import com.bambooJohn.ssm.bean.Emp;

public interface EmpService {

	public List<Emp> getAllEmps();
	
	public Emp getEmpByEid(String eid);
	
	public void updateEmp(Emp emp);
	
	public List<Dept> getAllDepts();
	
}
