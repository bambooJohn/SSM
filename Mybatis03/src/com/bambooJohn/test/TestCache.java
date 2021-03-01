package com.bambooJohn.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import com.bambooJohn.bean.Emp;
import com.bambooJohn.mapper.EmpMapper;

class TestCache {

	@Test
	void testSecondCache() throws IOException {
		
		/**
		 * mybatis的二级缓存默认不开启，需要设置：
		 * 1、在核心设置文件<settings>中，加入配置：<setting name="cacheEnabled" value="true"/>
		 * 2、需要使用二级缓存的映射文件处理使用cache配置缓存<cache/>
		 * 3、注意：POJO需要实现Serializable接口
		 * 注意：二级缓存在SqlSession关闭或提交之后才会生效
		 */
		
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession sqlSession1 = sqlSessionFactory.openSession(true);
		EmpMapper empMapper = sqlSession1.getMapper(EmpMapper.class);
		Emp empByEid = empMapper.getEmpByEid("17");
		System.out.println(empByEid);
		System.out.println("==============");
		sqlSession1.commit();
		/*SqlSession sqlSession2 = sqlSessionFactory.openSession(true);
		EmpMapper empMapper2 = sqlSession2.getMapper(EmpMapper.class);*/
		EmpMapper empMapper2 = sqlSession1.getMapper(EmpMapper.class);
		Emp empByEid2 = empMapper2.getEmpByEid("21");
		System.out.println(empByEid2);
		System.out.println("================");
		sqlSession1.commit();
		EmpMapper empMapper3 = sqlSession1.getMapper(EmpMapper.class);
		Emp empByEid3 = empMapper3.getEmpByEid("22");
		System.out.println(empByEid3);
		System.out.println("================");
		sqlSession1.commit();
		EmpMapper empMapper4 = sqlSession1.getMapper(EmpMapper.class);
		Emp empByEid4 = empMapper4.getEmpByEid("23");
		System.out.println(empByEid4);
	}
	
	@Test
	void testFirstCache() throws IOException {
		
		/*
		 * mybatis中的一级缓存默认开启，是SqlSession级别的
		 * 即同一个SqlSession对于一个sql语句，执行之后就会存储在缓存中，下次执行相同的sql，直接从缓存中取
		 * 一级缓存失效的情况：
		 * 不同的SqlSession对应不同的一级缓存
		 * 同一个SqlSession但是查询条件不同
		 * 同一个SqlSession两次查询期间执行了任何一次增删改操作，会自动将缓存清空
		 * 同一个SqlSession两次查询期间手动清空了缓存
		 */
		
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession sqlSession1 = sqlSessionFactory.openSession(true);
		EmpMapper empMapper = sqlSession1.getMapper(EmpMapper.class);
		Emp empByEid = empMapper.getEmpByEid("17");
		System.out.println(empByEid);
		System.out.println("==============");
		
		SqlSession sqlSession2 = sqlSessionFactory.openSession(true);
		EmpMapper empMapper2 = sqlSession2.getMapper(EmpMapper.class);
		Emp empByEid2 = empMapper.getEmpByEid("17");
		System.out.println(empByEid2);
	}
	
	public SqlSessionFactory getSqlSessionFactory() throws IOException {
		InputStream is = Resources.getResourceAsStream("Mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		return sqlSessionFactory;
	}

}
