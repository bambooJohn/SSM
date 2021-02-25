package com.bambooJohn.bean;

public class Emp {

	private Integer eid;
	
	private String ename;
	
	private Integer age;
	
	private String sex;

	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Emp(Integer eid, String ename, Integer age, String sex) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.age = age;
		this.sex = sex;
	}


	public Integer getEid() {
		return eid;
	}


	public void setEid(Integer eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", age=" + age + ", sex=" + sex + "]";
	}
	
	
}
