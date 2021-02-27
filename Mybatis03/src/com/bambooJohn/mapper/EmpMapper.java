package com.bambooJohn.mapper;

import java.util.List;

import com.bambooJohn.bean.Emp;

public interface EmpMapper {

	List<Emp> getEmpListByMoreTJ(Emp emp);
	
	//添加员工信息，0|1 --> 女|男
	void insertEmp(Emp emp);
	
}
