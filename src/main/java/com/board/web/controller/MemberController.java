package com.board.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.board.web.dao.MemberDao;
import com.board.web.entity.Member;
import com.board.web.service.MemberService;

@Controller
@RequestMapping("/member/")
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	MemberDao memberDao;
	
	@GetMapping("login")
	public String login() {

		return "member.login";
	}

	@GetMapping("join")
	public String join() {

		return "member.join";
	}
	
	@PostMapping("join")
	public String join(Member member) {

		memberService.insert(member);
		return "redirect:/member/login";
	}
	
	@ResponseBody
	@PostMapping("join/id-data")
	public int idCheck(String memberId) {
		
		return memberService.idCheck(memberId);
		
	}
	
	@GetMapping("editProfile")
	public String editProfile(Member member , HttpServletRequest request,Model model) {
		
		HttpSession session = request.getSession();
		
		String uid = (String)session.getAttribute("userId");
		List<Member> list = memberDao.selectEdit(uid);

		System.out.println(list);
		model.addAttribute("proFile" , list);
		
		
		return "member.editProfile";
	}
}
