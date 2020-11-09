package com.board.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.board.web.dao.DataTableDao;
import com.board.web.entity.DataTable;

@Controller
@RequestMapping("/dataTable/") 
public class DataTableController {
	
	@Autowired
	DataTableDao dataTableDao;
	
	@GetMapping("list")
	public String list(Model model) {
		 
		int count = dataTableDao.selectPageCount();	
		model.addAttribute("count",count);
		
		List<DataTable> list = dataTableDao.selectBoard();
		model.addAttribute("list" , list);
		
		return "dataTable.list";
	}
	
	@ResponseBody
	@PostMapping("insert-data")
	public String insert(String writeTitle,String writerId,String writeKind,String writeContent) {
		
		dataTableDao.insertBoard(writeTitle,writerId,writeKind,writeContent);
		
		return "redirect:/dataTable/list";
	}
}
