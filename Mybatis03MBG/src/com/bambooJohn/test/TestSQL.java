package com.bambooJohn.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import com.bambooJohn.bean.Emp;
import com.bambooJohn.bean.EmpExample;
import com.bambooJohn.bean.EmpExample.Criteria;
import com.bambooJohn.mapper.EmpMapper;


class TestSQL {

	@Test
	public void testCRUD() throws IOException {
		
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
		
		/*
		 * Preparing: select eid, ename, age, sex, did from emp WHERE ( ename like ? and sex = ? ) or( did = ? )
		 * Parameters: %a%(String), 1(String), 1(Integer)
		 * 
		 */
		
		EmpExample example = new EmpExample();
		Criteria c1 = example.createCriteria();
		c1.andEnameLike("%a%");
		c1.andSexEqualTo("1");
		
		Criteria c2 = example.createCriteria();
		c2.andDidEqualTo(1);
		example.or(c2);
		
		List<Emp> list = empMapper.selectByExample(example);
		for (Emp emp : list) {
			System.out.println(emp);
		}
		
		System.out.println("==============");
		/*
		 * Preparing: select eid, ename, age, sex, did from emp 
		 * Parameters:   
		 */
		List<Emp> list2 = empMapper.selectByExample(null);
		for (Emp emp : list2) {
			System.out.println(emp);
		}
		
	}
	
	@Test
	public void testMSG() throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
		   List<String> warnings = new ArrayList<String>();
		   boolean overwrite = true;
		   File configFile = new File("mbg.xml");
		   ConfigurationParser cp = new ConfigurationParser(warnings);
		   Configuration config = cp.parseConfiguration(configFile);
		   DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		   MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		   myBatisGenerator.generate(null);
	}

	public SqlSessionFactory getSqlSessionFactory() throws IOException {
		InputStream is = Resources.getResourceAsStream("Mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		return sqlSessionFactory;
	}
	
}
