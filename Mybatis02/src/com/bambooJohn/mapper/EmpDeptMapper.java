package com.bambooJohn.mapper;

import java.util.List;

import com.bambooJohn.bean.Dept;
import com.bambooJohn.bean.Emp;

public interface EmpDeptMapper {

	List<Emp> getAllEmps();
	
	Emp getEmpByStep(String eid);
	
	Dept getDeptByDid(String did);
	
}
