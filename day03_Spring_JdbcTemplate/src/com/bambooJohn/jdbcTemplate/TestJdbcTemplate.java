package com.bambooJohn.jdbcTemplate;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJdbcTemplate {

	ApplicationContext ac = new ClassPathXmlApplicationContext("jdbc.xml");
	JdbcTemplate jdbcTemplate = ac.getBean("jdbcTemplate", JdbcTemplate.class);
	
	@Test
	public void test() {

		//jdbcTemplate.update("insert into emp values(null,'张三',23,'男')");
		String sql = "insert into emp values(null,?,?,?)";
		jdbcTemplate.update(sql,"李四",24,"女");
	}

}
