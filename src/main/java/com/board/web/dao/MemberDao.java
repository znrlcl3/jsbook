package com.board.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.board.web.entity.Member;

@Mapper
public interface MemberDao {

	@Insert("INSERT INTO member (uid,pwd,name,phone) values (#{uid},#{pwd},#{name},#{phone})")
	void insert(Member member);

	@Select("SELECT COUNT(*) FROM member where uid=#{memberId}")
	int select(String memberId);

	@Select("SELECT *FROM member WHERE uid = #{uid}")
	List<Member> selectEdit(String uid);
	

	
	
}
