package com.bambooJohn.spring.di;

import java.util.List;
import java.util.Map;

public class Teacher {

	private String tid;
	
	private String tname;
	
	private List<String> cls;
	
	private List<Student> students;
	
	private Map<String,String> bossMap;

	public List<String> getCls() {
		return cls;
	}

	public void setCls(List<String> cls) {
		this.cls = cls;
	}

	
	
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	
	
	public Map<String, String> getBossMap() {
		return bossMap;
	}

	public void setBossMap(Map<String, String> bossMap) {
		this.bossMap = bossMap;
	}

	public Teacher() {
		super();
	}

	public Teacher(String tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", cls=" + cls + ", students=" + students + ", bossMap="
				+ bossMap + "]";
	}
	
	
	
}
