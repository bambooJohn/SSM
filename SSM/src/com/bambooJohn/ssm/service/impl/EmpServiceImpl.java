package com.bambooJohn.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bambooJohn.ssm.mapper.EmpMapper;
import com.bambooJohn.ssm.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	private EmpMapper empMapper;
	
}
