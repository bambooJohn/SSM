package com.bambooJohn.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.bambooJohn.bean.Emp;

public interface ParamMapper {

	void insertEmp(Emp emp);
	
	Emp getEmpByEid(String eid);
	
	Emp getEmpByEidAndEname(String eid,String ename);
	
	Emp getEmpByMap(Map<String,Object> map);
	
	Emp getEmpByParam(@Param("eid") String eid,@Param("ename") String ename);
	
}
