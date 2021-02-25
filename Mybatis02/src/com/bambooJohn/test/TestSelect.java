package com.bambooJohn.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.bambooJohn.bean.Emp;
import com.bambooJohn.mapper.EmpMapper;
import com.bambooJohn.mapper.EmpSelectMapper;

public class TestSelect {

	@Test
	public void test() throws IOException {
		InputStream is = Resources.getResourceAsStream("Mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		EmpSelectMapper empSelectMapper = sqlSession.getMapper(EmpSelectMapper.class);
		
		
		Emp emp = empSelectMapper.selectEmpByEid("1");
		System.out.println(emp);
		
		Integer count = empSelectMapper.getCount();
		System.out.println(count);
		
		Map<String, Object> map = empSelectMapper.getEmpMapByEid("1");
		System.out.println(map);
		
		Map<String, Object> allEmpMap = empSelectMapper.getAllEmpMap();
		System.out.println(allEmpMap);
		
	}

}
