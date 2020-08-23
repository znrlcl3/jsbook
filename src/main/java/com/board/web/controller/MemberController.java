package com.board.web.controller;

import java.security.Principal;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.board.web.dao.MemberDao;
import com.board.web.entity.Member;
import com.board.web.entity.MyUserDetails;
import com.board.web.service.MemberService;

@Controller
@RequestMapping("/member/")
public class MemberController {

	
	@Autowired
	MemberService memberService;

	@Autowired
	MemberDao memberDao;

	@GetMapping("list")
	public String list(Model model, Authentication authentication/*Principal principal*/) throws ClassNotFoundException, SQLException {
	      
	   //MyUserDetails userDetails = (MyUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	   MyUserDetails userDetails = (MyUserDetails)authentication.getPrincipal();
	      
	   if(authentication != null) {
	         
	      //MyUserDetails userDetails = (MyUserDetails)principal;
	      System.out.println("list controller");
	      System.out.println(userDetails.getId());
	      System.out.println(userDetails.getName());
	      System.out.println(userDetails.getPassword());
	      System.out.println(userDetails.getPhone());
	      System.out.println(userDetails.getModifyDate());
	   }
	return null;
	}



	
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
	public String editProfile(Member member, HttpServletRequest request, Model model) {

		HttpSession session = request.getSession();

		String uid = (String) session.getAttribute("userId");
		List<Member> list = memberDao.selectEdit(uid);

//		System.out.println(list);
		model.addAttribute("proFile", list);

		return "member.editProfile";
	}

	@PostMapping("name-edit")
	public String editName(String name,HttpServletRequest request, Model model) {
		
		HttpSession session = request.getSession();

		String uid = (String) session.getAttribute("userId");
		memberDao.updateName(name,uid);
		System.out.println("dd");
		return "redirect:/member/editProfile";
	}
	@PostMapping("pwd-edit")
	public String editPwd(String pwd,HttpServletRequest request, Model model) {
		
		HttpSession session = request.getSession();

		String uid = (String) session.getAttribute("userId");
		memberService.updatePwd(pwd,uid);

		return "redirect:/member/editProfile";
	}
	
	@PostMapping("phone-edit")
	public String editPhone(String phone,HttpServletRequest request, Model model) {
		
		HttpSession session = request.getSession();

		String uid = (String) session.getAttribute("userId");
		memberDao.updatePhone(phone,uid);
		
		return "redirect:/member/editProfile";
	}
	

}
