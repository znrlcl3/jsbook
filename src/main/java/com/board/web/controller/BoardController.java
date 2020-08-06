package com.board.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.board.web.dao.BoardDao;

@Controller
@RequestMapping("/board/")
public class BoardController {

	@Autowired
	private BoardDao boardDao;
	
	@GetMapping("list")
	public String list(Model model) {
		
		model.addAttribute("list", boardDao.select());
		
		return "/WEB-INF/view/board/list.jsp";
	}
}
