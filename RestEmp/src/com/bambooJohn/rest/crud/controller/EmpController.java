package com.bambooJohn.rest.crud.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
		//form标签有自动回显的功能，会在页面中能够默认获取request作用域中command属性的值
		/*map.put("command", new Employee());*/
		Map<String, String> genders = new HashMap<String,String>();
		genders.put("1", "男");
		genders.put("0", "女");
		map.put("genders", genders);
		map.put("emp", new Employee());
		return "edit";
		
	}
	
	@RequestMapping(value="/emp",method=RequestMethod.POST)
	public String addEmp(Employee employee) {
		employeeDao.save(employee);
		return "redirect:/emps";
	}
	
	@RequestMapping(value="/emp/{emp.id}",method=RequestMethod.GET)
	public String toUpdate(@PathVariable("emp.id") Integer id,Map<String,Object> map) {
		Employee employee = employeeDao.get(id);
		map.put("emp", employee);
		Collection<Department> depts = departmentDao.getDepartments();
		Map<String, String> genders = new HashMap<String,String>();
		genders.put("1", "男");
		genders.put("0", "女");
		map.put("depts", depts);
		map.put("genders", genders);
	//	return "update";
		return "edit";
	}
	
	@RequestMapping(value="/emp",method=RequestMethod.PUT)
	public String updateEmp(Employee employee) {
		employeeDao.save(employee);
		return "redirect:/emps";
	}
	
	@RequestMapping(value="/emp/{emp.id}",method=RequestMethod.DELETE)
	public String deleteEmp(@PathVariable("emp.id") Integer id) {
		employeeDao.delete(id);
		return "redirect:/emps";
	}
	
}
