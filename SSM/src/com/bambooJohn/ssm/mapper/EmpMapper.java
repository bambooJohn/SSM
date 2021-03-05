package com.bambooJohn.ssm.mapper;

import java.util.List;

import com.bambooJohn.ssm.bean.Dept;
import com.bambooJohn.ssm.bean.Emp;

public interface EmpMapper {

	//获取所有员工信息
	List<Emp> getAllEmps();	
	
	//根据eid获取员工信息
	Emp getEmpByEid(String eid);
	
	//修改员工信息
	void updateEmp(Emp emp);
	
	//获取所有的部门信息
	List<Dept> getAllDepts();
	
}
