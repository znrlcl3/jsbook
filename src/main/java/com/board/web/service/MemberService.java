package com.board.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.board.web.dao.MemberDao;
import com.board.web.entity.Member;


@Service
public class MemberService {
	
	@Autowired
	private MemberDao memberDao;
	
	public void insert(Member member) {
	
		String pwd = member.getPwd();
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		member.setPwd(encoder.encode(pwd));
		
		
		memberDao.insert(member);
	}

	public int idCheck(String memberId) {
		// TODO Auto-generated method stub
		
		return memberDao.select(memberId); 
		
	}

	public void updatePwd(String pwd, String uid) {
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		System.out.println(encoder.encode(pwd));
		
		memberDao.updatePwd(pwd,uid);
		
	}

	public void changePwd(String uid,String pwd2) {
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		pwd2 =encoder.encode(pwd2);
		memberDao.changePwd(uid,pwd2);
		
		
	}

}
