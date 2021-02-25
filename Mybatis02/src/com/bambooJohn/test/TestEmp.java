package com.bambooJohn.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.bambooJohn.bean.Emp;
import com.bambooJohn.mapper.EmpMapper;

public class TestEmp {

	@Test
	public void test() throws IOException {
		InputStream is = Resources.getResourceAsStream("Mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
		
		
		Emp emp = empMapper.getEmpByEid("1");
		System.out.println(emp);
		
		empMapper.addEmp(new Emp(null, "aa", 23, "男"));
	
		//empMapper.deleteEmp("8"); //无效
		//sqlSession.commit();
		
		empMapper.updateEmp(new Emp(1, "王二", 23, "男"));
		
		List<Emp> emps = empMapper.getAllEmps();
		System.out.println(emps);
		
	}

}
