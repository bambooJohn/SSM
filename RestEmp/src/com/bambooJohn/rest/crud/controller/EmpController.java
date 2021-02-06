package com.bambooJohn.rest.crud.controller;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bambooJohn.rest.crud.bean.Department;
import com.bambooJohn.rest.crud.bean.Employee;
import com.bambooJohn.rest.crud.dao.DepartmentDao;
import com.bambooJohn.rest.crud.dao.EmployeeDao;

@Controller
public class EmpController {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Autowired
	private DepartmentDao departmentDao;
	
	@RequestMapping(value="/emps")
	public String getAll(Map<String,Object> map) {
		
		Collection<Employee> emps = employeeDao.getAll();
		map.put("emps", emps);
		
		return "list";
	}
	
	@RequestMapping(value="/emp",method=RequestMethod.GET)
	public String toAdd(Map<String,Object> map) {
		Collection<Department> depts = departmentDao.getDepartments();
		map.put("depts", depts);
		return "add";
		
	}
	
	@RequestMapping(value="/emp",method=RequestMethod.POST)
	public String addEmp(Employee employee) {
		employeeDao.save(employee);
		return "redirect:/emps";
	}
	
}