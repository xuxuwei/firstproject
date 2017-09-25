package com.tiedao.pojo;

public class TbRoleModule {
	private int id;
	private int rid;  //角色ID
	private int mid; //模块ID
	public TbRoleModule() {
		super();
	}
	public TbRoleModule(int id, int rid, int mid) {
		super();
		this.id = id;
		this.rid = rid;
		this.mid = mid;
	}
	public TbRoleModule(int rid, int mid) {
		super();
		this.rid = rid;
		this.mid = mid;
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
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	@Override
	public String toString() {
		return "TbRoleModule [id=" + id + ", rid=" + rid + ", mid=" + mid + "]";
	}
	

}
