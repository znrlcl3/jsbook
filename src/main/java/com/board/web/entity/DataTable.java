package com.board.web.entity;

import java.sql.Date;

public class DataTable {

	private int id;
	private String title;
	private String writerId;
	private String dept_name;
	private Date regDate;
	private String kind;
	public DataTable(int id, String title, String writerId, String dept_name, Date regDate, String kind) {
		super();
		this.id = id;
		this.title = title;
		this.writerId = writerId;
		this.dept_name = dept_name;
		this.regDate = regDate;
		this.kind = kind;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriterId() {
		return writerId;
	}
	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	@Override
	public String toString() {
		return "DataTable [id=" + id + ", title=" + title + ", writerId=" + writerId + ", dept_name=" + dept_name
				+ ", regDate=" + regDate + ", kind=" + kind + "]";
	}
	
	

	
}
