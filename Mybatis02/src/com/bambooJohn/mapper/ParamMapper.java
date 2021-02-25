package com.bambooJohn.mapper;

import java.util.Map;

import com.bambooJohn.bean.Emp;

public interface ParamMapper {

	void insertEmp(Emp emp);
	
	Emp getEmpByEid(String eid);
	
	Emp getEmpByEidAndEname(String eid,String ename);
	
	Emp getEmpByMap(Map<String,Object> map);
	
}
