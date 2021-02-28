package com.bambooJohn.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import com.bambooJohn.bean.Emp;
import com.bambooJohn.mapper.EmpMapper;

class TestSQL {

	
	@Test
	void testForeach() throws IOException {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
		
		Emp[] emps = new Emp[3];
		/*emps[0] = new Emp(null,"a",23,"男");
		emps[1] = new Emp(null,"aa",23,"男");
		emps[2] = new Emp(null,"aaa",23,"男");
		
		empMapper.insertMoreByArray(emps);*/
		
		emps[0] = new Emp(21,"a1",23,"男");
		emps[1] = new Emp(22,"aa1",23,"男");
		emps[2] = new Emp(23,"aaa1",23,"男");
		
		empMapper.updateMoreByArray(emps);
		
		/*List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		empMapper.deleteMoreByList(list);*/
		
	}
	
	@Test
	void testDelete() throws IOException {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
		
		String eids = "1,2,6";
		
		empMapper.deleteEmps(eids);
		
	}
	
	
	@Test
	void testChoose() throws IOException {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
		Emp emp = new Emp();
		//emp.setEid(1);
		emp.setEname("李三三");
		emp.setAge(23);
		emp.setSex("0");
		empMapper.insertEmp(emp);
		
	}
	
	@Test
	void test() throws IOException {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
		Emp emp = new Emp();
		//emp.setEid(1);
		emp.setEname("李三");
		emp.setAge(23);
		//emp.setSex("1");
		List<Emp> empListByMoreTJ = empMapper.getEmpListByMoreTJ(emp);
		System.out.println(empListByMoreTJ);
		
	}

	public SqlSessionFactory getSqlSessionFactory() throws IOException {
		InputStream is = Resources.getResourceAsStream("Mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		return sqlSessionFactory;
	}
	
}
