package com.bambooJohn.ioc.auto;

public class Car extends CarExtends{

	private Integer cid;
	private String cname;
	
	
	
	public Car() {
		super();
	}
	public Car(Integer cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Car [cid=" + cid + ", cname=" + cname + "]";
	}
	
	
	
}
