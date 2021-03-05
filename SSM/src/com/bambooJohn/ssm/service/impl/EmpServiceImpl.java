package com.bambooJohn.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bambooJohn.ssm.bean.Dept;
import com.bambooJohn.ssm.bean.Emp;
import com.bambooJohn.ssm.mapper.EmpMapper;

import com.bambooJohn.ssm.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	private EmpMapper empMapper;
	
	public List<Emp> getAllEmps(){
		
		return empMapper.getAllEmps();
		
	}

	@Override
	public Emp getEmpByEid(String eid) {
		// TODO Auto-generated method stub
		return empMapper.getEmpByEid(eid);
	}

	@Override
	public List<Dept> getAllDepts() {
		// TODO Auto-generated method stub
		return empMapper.getAllDepts();
	}

	@Override
	public void updateEmp(Emp emp) {
		// TODO Auto-generated method stub
		empMapper.updateEmp(emp);
	}
	
}
