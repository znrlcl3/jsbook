package com.board.web.entity;

public class Member {

	private int id;
	private String uid;
	private String pwd;
	private String name;
	private String phone;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	public Member(int id, String uid, String pwd, String name, String phone) {
		this.id = id;
		this.uid = uid;
		this.pwd = pwd;
		this.name = name;
		this.phone = phone;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", uid=" + uid + ", pwd=" + pwd + ", name=" + name + ", phone=" + phone + "]";
	}
	
	
	
}
