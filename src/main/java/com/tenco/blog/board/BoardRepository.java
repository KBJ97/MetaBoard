package com.tenco.blog.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardRepository {
	public int insert(BoardDto board);
	public int updateById(BoardDto board);
	public int deleteById(Integer id);
	public List<BoardDto> findAll();
	public BoardDto findById(int id);

	
}
