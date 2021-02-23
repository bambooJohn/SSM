package com.bambooJohn.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import com.bambooJohn.bean.User;
import com.bambooJohn.mapper.UserMapper;

class UserTest {

	/*
	 * mybatis搭建过程：
	 * 导入jar
	 * 创建mybatis的核心（全局）配置文件mybatis-config.xml，并配置
	 * 创建映射文件XxxMapper.xml，并配置
	 * 创建mapper接口，实现两个绑定：
	 * 	（1）接口全限定名要和映射文件的namespace保持一致
	 * 	（2）接口中方法名和SQL语句的id保持一致
	 * 获取mybatis操作数据库的会话对象SqlSession，通过getMapper()获取接口的动态代理实现类
	 * 测试
	 */
	
	@Test
	void test() throws IOException {
		InputStream is = Resources.getResourceAsStream("Mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//get<apper():会通过动态代理动态生成UserMapper的代理实现类
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		System.out.println(userMapper.getClass().getName()); // com.sun.proxy.$Proxy8
		User user = userMapper.getUserByUid("1");
		System.out.println(user);
	}

}
