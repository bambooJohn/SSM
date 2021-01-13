package com.bambooJohn.ioc.life;

public class Person {

	private Integer id;
	
	private String sex;
	
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		System.out.println("Two:设置id");
		this.id = id;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person() {
		super();
		System.out.println("One:构造Person");
	}

	public Person(Integer id, String sex, String name) {
		super();
		this.id = id;
		this.sex = sex;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Four:使用Person";
	}
	
	public void init() {
		System.out.println("Three:初始化Person");
	}
	
	public void destroy() {
		System.out.println("Five:销毁Person");
	}
	
}
