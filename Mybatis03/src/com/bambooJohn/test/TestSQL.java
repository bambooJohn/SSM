package com.bambooJohn.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.io.InputStream;
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
	void test() throws IOException {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
		Emp emp = new Emp();
		//emp.setEid(1);
		emp.setEname("李三");
		emp.setAge(23);
		emp.setSex("1");
		List<Emp> empListByMoreTJ = empMapper.getEmpListByMoreTJ(emp);
		System.out.println(empListByMoreTJ);
		
	}

	public SqlSessionFactory getSqlSessionFactory() throws IOException {
		InputStream is = Resources.getResourceAsStream("Mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		return sqlSessionFactory;
	}
	
}
