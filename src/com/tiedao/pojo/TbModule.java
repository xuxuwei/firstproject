package com.tiedao.pojo;

public class TbModule {
	private int id;
	private String mname;
	private int upid;
	private String url;
	private String demo;

	public TbModule() {
		super();
	}

	public TbModule(String mname, int upid, String url, String demo) {
		super();
		this.mname = mname;
		this.upid = upid;
		this.url = url;
		this.demo = demo;
	}

	public TbModule(int id, String mname, int upid, String url, String demo) {
		super();
		this.id = id;
		this.mname = mname;
		this.upid = upid;
		this.url = url;
		this.demo = demo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public int getUpid() {
		return upid;
	}

	public void setUpid(int upid) {
		this.upid = upid;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDemo() {
		return demo;
	}

	public void setDemo(String demo) {
		this.demo = demo;
	}

	@Override
	public String toString() {
		return "TbModule [id=" + id + ", mname=" + mname + ", upid=" + upid
				+ ", url=" + url + ", demo=" + demo + "]";
	}
}
