package com.bambooJohn.ioc.scope;

public class Student {

	private Integer sid;
	
	private String sname;

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Student() {
		System.out.println("Student 构造方法");
	}

	public Student(Integer sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	
	
	
}
