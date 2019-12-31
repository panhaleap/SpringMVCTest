package com.mcnc.springmybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mcnc.springmybatis.dao.BoardDAO;
import com.mcnc.springmybatis.service.api.IBoardService;
import com.mcnc.springmybatis.service.dto.BoardDTO;

public class BoardService implements IBoardService{

	@Autowired
	BoardDAO boardDAO;

	@Override
	public BoardDTO findByBoardId(int boardId) {
		// TODO Auto-generated method stub
		return boardDAO.findByBoardId(boardId);
	}

	@Override
	public List<BoardDTO> getAllBoards() {
		return boardDAO.getAllBoards();
	}

	@Override
	public void updateByBoardId(BoardDTO board) {
		boardDAO.updateByBoardId(board);
	}
}
