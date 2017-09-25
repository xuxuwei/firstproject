package com.tiedao.pojo;

import java.util.List;

public class Tbgrade {
	private int id;
	private int rid;
	private int studentid;
	private String name;
	private String rname;
	private int english;
	private int math;
	private int chinese;

	

	public Tbgrade() {
		super();
	}

	public Tbgrade(int id, int rid, int studentid, String name,
			String rname, int english, int math) {
		super();
		this.id = id;
		this.rid = rid;
		this.studentid = studentid;
		this.name = name;
		this.rname = rname;
		this.english = english;
		this.math = math;
	}
	

	public Tbgrade(int rid, int studentid, String name, String rname,
			int english, int math) {
		super();
		this.rid = rid;
		this.studentid = studentid;
		this.name = name;
		this.rname = rname;
		this.english = english;
		this.math = math;
	}

	public Tbgrade(int rid, int studentid, String name, String rname,
			int english, int math, int chinese) {
		super();
		this.rid = rid;
		this.studentid = studentid;
		this.name = name;
		this.rname = rname;
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}
	

	public Tbgrade(int id, int rid, int studentid, String name,
			String rname, int english, int math, int chinese) {
		super();
		this.id = id;
		this.rid = rid;
		this.studentid = studentid;
		this.name = name;
		this.rname = rname;
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}
	
	


	public Tbgrade(int id, int chinese) {
		super();
		this.id = id;
		this.chinese = chinese;
	}

	public int getChinese() {
		return chinese;
	}

	public void setChinese(int chinese) {
		this.chinese = chinese;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "TbUser [id=" + id + ", rid=" + rid + ", studentid=" + studentid
				+ ", name=" + name + ", rname=" + rname + ", english="
				+ english + ", math=" + math + "]";
	}

}
