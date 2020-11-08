package com.board.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.board.web.entity.DataTable;

@Mapper
public interface DataTableDao {

	@Select("SELECT COUNT(*) FROM board_dataTable")
	int selectPageCount();

	@Select("SELECT A.ID id,A.TITLE title,B.NAME dept_name,C.NAME writerId,A.REGDATE regDate,A.kind FROM board_datatable as A, dept as B, member_datatable as C WHERE A.WRITERID=C.USERID AND B.ID= C.DEPT_ID ORDER BY A.ID ASC")
	List<DataTable> selectBoard();

}
