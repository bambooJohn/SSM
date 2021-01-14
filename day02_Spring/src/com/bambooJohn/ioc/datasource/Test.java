package com.bambooJohn.ioc.datasource;

import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

public class Test {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("datasource.xml");
		DruidDataSource dataSource = ac.getBean("datasource", DruidDataSource.class);

		System.out.println(dataSource.getConnection());
		
	}

}
