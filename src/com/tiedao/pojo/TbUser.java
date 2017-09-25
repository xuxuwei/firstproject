package com.tiedao.pojo;

import java.util.List;

public class TbUser {
	private int id;
	private String uname;
	private String pass;
	private String sex;
	private String education;
	private String hobbies;
	private String demo;
	private int roleid;

	private List<Hobbies> hobbiesList;

	public List<Hobbies> getHobbiesList() {
		return hobbiesList;
	}

	public void setHobbiesList(List<Hobbies> hobbiesList) {
		this.hobbiesList = hobbiesList;
	}

	public TbUser() {
		super();
	}

	public TbUser(int id, String uname, String pass, String sex,
			String education, String hobbies, String demo) {
		super();
		this.id = id;
		this.uname = uname;
		this.pass = pass;
		this.sex = sex;
		this.education = education;
		this.hobbies = hobbies;
		this.demo = demo;
	}
	

	public TbUser(String uname, String pass, String sex, String education,
			String hobbies, String demo) {
		super();
		this.uname = uname;
		this.pass = pass;
		this.sex = sex;
		this.education = education;
		this.hobbies = hobbies;
		this.demo = demo;
	}

	public TbUser(String uname, String pass, String sex, String education,
			String hobbies, String demo, int roleid) {
		super();
		this.uname = uname;
		this.pass = pass;
		this.sex = sex;
		this.education = education;
		this.hobbies = hobbies;
		this.demo = demo;
		this.roleid = roleid;
	}
	

	public TbUser(int id, String uname, String pass, String sex,
			String education, String hobbies, String demo, int roleid) {
		super();
		this.id = id;
		this.uname = uname;
		this.pass = pass;
		this.sex = sex;
		this.education = education;
		this.hobbies = hobbies;
		this.demo = demo;
		this.roleid = roleid;
	}
	public TbUser(int id, int roleid) {
		super();
		this.id = id;
		this.roleid = roleid;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getDemo() {
		return demo;
	}

	public void setDemo(String demo) {
		this.demo = demo;
	}

	@Override
	public String toString() {
		return "TbUser [id=" + id + ", uname=" + uname + ", pass=" + pass
				+ ", sex=" + sex + ", education=" + education + ", hobbies="
				+ hobbies + ", demo=" + demo + "]";
	}

}
