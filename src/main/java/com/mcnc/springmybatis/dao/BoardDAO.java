package com.mcnc.springmybatis.dao;

import java.util.List;

import com.mcnc.springmybatis.service.dto.BoardDTO;

public interface BoardDAO {
	public BoardDTO findByBoardId(int boardId);
	public List<BoardDTO> getAllBoards();
	public void updateByBoardId(BoardDTO board);
}
