package com.board.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.board.web.entity.Board;

@Mapper
public interface BoardDao {

	@Select("Select *FROM board ORDER BY id ASC LIMIT ${index} , 10")
	List<Board> select(int index);

	@Select("SELECT COUNT(*) FROM board")
	int selectBoardCount();
	
	@Select("SELECT *FROM board where id = ${id}")
	List<Board> selectDetail(int id);

	@Delete("DELETE FROM board where id = #{boardId}")
	void delete(String boardId);

	@Insert("INSERT INTO board (title,writerId,content) values (#{title},#{writerId},#{content})")
	void insertBoard(String title, String writerId, String content);
	
}
