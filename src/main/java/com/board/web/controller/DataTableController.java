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
@RequestMapping("/dataTable/")
public class DataTableController {
	
	
	@GetMapping("list")
	public String list() {
		
		return "dataTable.list";
	}
}
