package com.bambooJohn.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.MapKey;

import com.bambooJohn.bean.Emp;

public interface EmpSelectMapper {

	Emp selectEmpByEid(String eid);
	
	Integer getCount();
	
	Map<String,Object> getEmpMapByEid(String eid);
	
	@MapKey("eid") // 设置map的键，因为在查询时传出所有的员工信息，可以把员工信息作为值，但是必须设置键
	Map<String,Object> getAllEmpMap();
	
}
