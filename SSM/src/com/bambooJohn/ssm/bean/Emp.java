package com.bambooJohn.ssm.bean;

public class Emp {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.eid
     *
     * @mbggenerated Mon Mar 01 23:21:55 GMT+08:00 2021
     */
    private Integer eid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.ename
     *
     * @mbggenerated Mon Mar 01 23:21:55 GMT+08:00 2021
     */
    private String ename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.age
     *
     * @mbggenerated Mon Mar 01 23:21:55 GMT+08:00 2021
     */
    private Integer age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.sex
     *
     * @mbggenerated Mon Mar 01 23:21:55 GMT+08:00 2021
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.did
     *
     * @mbggenerated Mon Mar 01 23:21:55 GMT+08:00 2021
     */
    private Integer did;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.eid
     *
     * @return the value of emp.eid
     *
     * @mbggenerated Mon Mar 01 23:21:55 GMT+08:00 2021
     */
    public Integer getEid() {
        return eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.eid
     *
     * @param eid the value for emp.eid
     *
     * @mbggenerated Mon Mar 01 23:21:55 GMT+08:00 2021
     */
    public void setEid(Integer eid) {
        this.eid = eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.ename
     *
     * @return the value of emp.ename
     *
     * @mbggenerated Mon Mar 01 23:21:55 GMT+08:00 2021
     */
    public String getEname() {
        return ename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.ename
     *
     * @param ename the value for emp.ename
     *
     * @mbggenerated Mon Mar 01 23:21:55 GMT+08:00 2021
     */
    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.age
     *
     * @return the value of emp.age
     *
     * @mbggenerated Mon Mar 01 23:21:55 GMT+08:00 2021
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.age
     *
     * @param age the value for emp.age
     *
     * @mbggenerated Mon Mar 01 23:21:55 GMT+08:00 2021
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.sex
     *
     * @return the value of emp.sex
     *
     * @mbggenerated Mon Mar 01 23:21:55 GMT+08:00 2021
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.sex
     *
     * @param sex the value for emp.sex
     *
     * @mbggenerated Mon Mar 01 23:21:55 GMT+08:00 2021
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.did
     *
     * @return the value of emp.did
     *
     * @mbggenerated Mon Mar 01 23:21:55 GMT+08:00 2021
     */
    public Integer getDid() {
        return did;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.did
     *
     * @param did the value for emp.did
     *
     * @mbggenerated Mon Mar 01 23:21:55 GMT+08:00 2021
     */
    public void setDid(Integer did) {
        this.did = did;
    }

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", age=" + age + ", sex=" + sex + ", did=" + did + "]";
	}
    
    
}