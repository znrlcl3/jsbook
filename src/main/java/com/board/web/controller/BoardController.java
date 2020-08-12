package com.board.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.web.dao.BoardDao;
import com.board.web.dao.entity.Paging;



@Controller
@RequestMapping("/board/")
public class BoardController {

	@Autowired
	private BoardDao boardDao;
	
	@GetMapping("list")
	public String list(@RequestParam(name="p" , defaultValue = "1") int page,Model model) {
		
		
		int total = boardDao.selectBoardCount();
		int index = (page*10) -10;

		model.addAttribute("list", boardDao.select(index));

		Paging paging = new Paging();
		paging.setNowPage(page);
		paging.setTotal(total);
		
		
		System.out.println(paging);
		model.addAttribute("paging" , paging);

		
	
		
		return "board.list";
	}
}
