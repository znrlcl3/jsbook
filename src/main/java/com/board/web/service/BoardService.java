package com.board.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.web.dao.BoardDao;
import com.board.web.entity.Board;

	
@Service
public class BoardService {
	
	@Autowired
	private BoardDao boardDao;

	public List<Board> detail(int id) {
		
		return boardDao.selectDetail(id);
	}
	
	

}
