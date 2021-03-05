package com.bambooJohn.ssm.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bambooJohn.ssm.bean.Dept;
import com.bambooJohn.ssm.bean.Emp;
import com.bambooJohn.ssm.mapper.EmpMapper;
import com.bambooJohn.ssm.service.EmpService;
import com.bambooJohn.ssm.util.PageUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


@Controller
public class EmpController {

	@Autowired
	private EmpService empService;
	
	@RequestMapping(value="/emps/{pageNum}",method=RequestMethod.GET)
	public String getAllEmps(Map<String,Object> map,@PathVariable("pageNum")Integer pageNum,HttpServletRequest request) {
		//通过PageHelper设置页面信息，第一个参数为页数，第二个参数为每页显示的条数
		PageHelper.startPage(pageNum,4);
		
		List<Emp> emps = empService.getAllEmps();
		map.put("emps", emps);
		//PageInfo中封装了分页相关的所有信息，当前页的页数，上一页的页数，下一页的页数，总页数，总条数...
		PageInfo<Emp> pageInfo = new PageInfo<>(emps, 5);
		String pages = PageUtil.getPageInfo(pageInfo, request);
		map.put("pages", pages);
		return "list";
	}
	
	@RequestMapping(value="/emp/{eid}",method=RequestMethod.GET)
	public String tpUpdateEmpByEid(@PathVariable("eid")String eid,Map<String,Object> map) {
		//要修改的员工信息
		Emp emp = empService.getEmpByEid(eid);
		
		map.put("emp", emp);
		//获取存储性别的map
		Map<String,Object> sexs = new HashMap<>();
		sexs.put("0", "女");
		sexs.put("1", "男");
		map.put("sexs", sexs);
		//所有的部门信息
		List<Dept> depts = empService.getAllDepts();
		
		map.put("depts", depts);
		
		return "update";		
	}
	
	
	@RequestMapping(value="/emp",method=RequestMethod.PUT)
	public String updateEmp(Emp emp) {
		empService.updateEmp(emp);
		
		return "redirect:/emps/1";
	}
	
	@RequestMapping(value="/emps",method=RequestMethod.DELETE)
	public String deleteMoreEmps(String[] eid) {
		System.out.println(Arrays.toString(eid));
		return "";
	}
	
}
