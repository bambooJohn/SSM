package com.bambooJohn.bean;

import org.springframework.stereotype.Component;

@Component
public class Teacher {
	
	private Integer id;
	
	private String name;

	public Teacher(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Teacher() {
		super();
		System.out.println("teacher==>无参构造函数");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + "]";
	}
	
	

}
