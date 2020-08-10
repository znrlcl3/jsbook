package com.board.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.board.web.dao.entity.Board;

@Mapper
public interface BoardDao {

	@Select("Select *FROM board ORDER BY id ASC LIMIT ${index} , 10")
	List<Board> select(int index);

	@Select("SELECT COUNT(*) FROM board")
	int selectBoardCount();
	
}
