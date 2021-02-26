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
import com.bambooJohn.mapper.EmpDeptMapper;
import com.bambooJohn.mapper.ParamMapper;

public class TestEmpDept {

	@Test
	public void test() throws IOException {
		InputStream is = Resources.getResourceAsStream("Mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		//SqlSession sqlSession = sqlSessionFactory.openSession(); // 需要手动处理事务
		SqlSession sqlSession = sqlSessionFactory.openSession(true); // 自动处理事务
		EmpDeptMapper empDeptMapper = sqlSession.getMapper(EmpDeptMapper.class);
		/*List<Emp> emps = empDeptMapper.getAllEmps();
		System.out.println(emps);*/
		Emp empByStep = empDeptMapper.getEmpByStep("2");
		System.out.println(empByStep.getEname());
		System.out.println("===============");
		System.out.println(empByStep.getDept());
	}

}
