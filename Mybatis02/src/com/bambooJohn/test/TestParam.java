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
import com.bambooJohn.mapper.ParamMapper;

public class TestParam {

	@Test
	public void test() throws IOException {
		InputStream is = Resources.getResourceAsStream("Mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		//SqlSession sqlSession = sqlSessionFactory.openSession(); // 需要手动处理事务
		SqlSession sqlSession = sqlSessionFactory.openSession(true); // 自动处理事务
		ParamMapper paramMapper = sqlSession.getMapper(ParamMapper.class);
		Emp emp = new Emp(null, "赵洞庭", 23, "男");
		paramMapper.insertEmp(emp);
		System.out.println(emp.getEid()); // 获取主键eid
		
	}

}
