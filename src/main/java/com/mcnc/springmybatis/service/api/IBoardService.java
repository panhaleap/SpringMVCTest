package com.mcnc.springmybatis.service.api;

import java.util.List;

import com.mcnc.springmybatis.service.dto.BoardDTO;

public interface IBoardService {
	public BoardDTO findByBoardId(int boardId);
	public List<BoardDTO> getAllBoards();	
	public void updateByBoardId(BoardDTO board);
}
