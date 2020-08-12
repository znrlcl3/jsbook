package com.board.web.entity;

import java.sql.Date;

public class Board {

	private int id;
	private String title;
	private String writerId;
	private Date regDate;
	private String content;
	private int hit;

	public Board(int id, String title, String writerId, Date regDate, String content , int hit) {
		super();
		this.id = id;
		this.title = title;
		this.writerId = writerId;
		this.regDate = regDate;
		this.content = content;
		this.hit = hit;
	}


	@Override
	public String toString() {
		return "Board [id=" + id + ", title=" + title + ", writerId=" + writerId + ", regDate=" + regDate + ", content="
				+ content + ", hit=" + hit + "]";
	}


	public int getHit() {
		return hit;
	}


	public void setHit(int hit) {
		this.hit = hit;
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

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
