package com.board.web.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.board.web.entity.Member;

@Mapper
public interface MemberDao {

	@Insert("INSERT INTO member (uid,pwd,name,phone) values (#{uid},#{pwd},#{name},#{phone})")
	void insert(Member member);

	
	
}
