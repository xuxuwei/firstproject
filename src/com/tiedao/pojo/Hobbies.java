package com.tiedao.pojo;
/**
 * 用于处理爱好
 * @author yangming
 *
 */
public class Hobbies {
	private String name;
	private boolean flag;
	
	public Hobbies(String name, boolean flag) {
		super();
		this.name = name;
		this.flag = flag;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
}
