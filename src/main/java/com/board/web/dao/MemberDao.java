package com.board.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.board.web.entity.Member;

@Mapper
public interface MemberDao {

	@Insert("INSERT INTO member (uid,pwd,name,phone) values (#{uid},#{pwd},#{name},#{phone})")
	void insert(Member member);

	@Select("SELECT COUNT(*) FROM member where uid=#{memberId}")
	int select(String memberId);

	@Select("SELECT *FROM member WHERE uid = #{uid}")
	List<Member> selectEdit(String uid);

	@Update("UPDATE member SET name=#{name} where uid=#{uid}")
	void updateName(String name,String uid);

	@Update("UPDATE member SET pwd=#{pwd} , modifyDate = CURRENT_TIMESTAMP where uid=#{uid}")
	void updatePwd(String pwd, String uid);

	@Update("UPDATE member SET phone=#{phone} where uid=#{uid}")
	void updatePhone(String phone,String uid);

	@Select("SELECT *FROM member where uid=#{username}")
	Member get(String username);

	@Select("SELECT uid from member where name = #{name} AND phone='${phone1}-${phone2}-${phone3}'")
	String findId(String name, String phone1, String phone2, String phone3);

	
	

	
	
}
