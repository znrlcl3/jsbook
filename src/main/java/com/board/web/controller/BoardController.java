package com.board.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.web.dao.BoardDao;
import com.board.web.entity.Board;
import com.board.web.entity.Paging;
import com.board.web.service.BoardService;



@Controller
@RequestMapping("/board/")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
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
		model.addAttribute("paging" , paging);
		
		return "board.list";
	}
	@GetMapping("detail")
	public String detail(@RequestParam(name="id") int id , Model model) {
		
		List<Board> detail = boardService.detail(id);
		model.addAttribute("detail" , detail);
		
		return "board.detail";
	}
	
	@PostMapping("/detail/delete-data")
	public String delete(String boardId) {
		
		boardDao.delete(boardId);
		
		return "redirect:/board/list";
	}
}
