package com.tiedao.pojo;

public class TbRole {
	private int id;
	private String rname;

	public TbRole(int id, String rname) {
		super();
		this.id = id;
		this.rname = rname;
	}

	public TbRole() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	@Override
	public String toString() {
		return "TbRole [id=" + id + ", rname=" + rname + "]";
	}
}
