package com.mcnc.springmybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mcnc.springmybatis.service.dto.BoardDTO;
import com.mcnc.springmybatis.service.impl.BoardService;

@Controller @RequestMapping("/faq")
public class FaqBoardController {	
	
	private static final String FAQBOARD_FOULDER = "faq-board/";
	private static final String FAQBOARD_LIST = FAQBOARD_FOULDER + "faq-board";
	private static final String DETAIL = FAQBOARD_FOULDER + "faq-board-detail";
	private static final String UPDATE = FAQBOARD_FOULDER + "UpdateBoardContent";
	@Autowired
	BoardService boardService;
	
	@RequestMapping("/listOfFaq")
	public String showListOfFaq(Model model){
		List<BoardDTO> boards = boardService.getAllBoards();
		model.addAttribute("boardList", boards);
		return FAQBOARD_LIST;
	}
	
	@RequestMapping("/faqDemo")
	public String showFaqDemo(Model model) {
		List<BoardDTO> boards = boardService.getAllBoards();
		model.addAttribute("boardList", boards);
		return "faq-board/demo";
	}
	
//	@RequestMapping("/faqBoardDetail")
//	public String showFaqDetail(@RequestParam("boardId") int boardId, Model model){
//		Board board = boardMapper.findByBoardId(boardId);
//		
//		List<Attach> attachList = attachMapper.findByBoardId(boardId);
//		model.addAttribute("attachList", attachList);
//		
//		List<BoardComment> boardComments = boardCommentMapper.findByBoardId(boardId);
//		model.addAttribute("board", board);
//		
//		model.addAttribute("commentList", boardComments);
//		return DETAIL;
//	}
//	
//	@RequestMapping("/saveComment")
//	public String saveCategory(@RequestParam ("comments") String comments,@RequestParam("boardId") int boardId){
//		BoardComment boardComment = new BoardComment();
//		boardComment.setComments(comments);
//		boardCommentMapper.saveComment(boardComment, boardId);
//		System.out.println("Saved comment");
//
//		return "redirect:/faq/faqBoardDetail?boardId=" + boardId;
//	}
//	
//	@RequestMapping("/updateFaqContent")
//	public String updateCategory(@RequestParam("boardId") int boardId, Model model){
//		Board board = boardMapper.findByBoardId(boardId);
//		model.addAttribute("board", board);
//		return UPDATE;
//	}
//	
//	@RequestMapping(value="/saveUpdate", method = RequestMethod.POST)
//	public String saveUpdateCategory(@RequestParam ("html") String html,  
//									@RequestParam("file") MultipartFile file, 
//									@ModelAttribute("board") Board board){
//		Map<String, Object> fileDetail = uploadFileConfiguration.uploadFileHandler(file);
//		if(fileDetail != null) {
//			fileDetail.put("boardId", board.getId());
//			fileDetail.put("createdBy", "panha");
//			attachMapper.insertAttachFile(fileDetail);
//		}
//		board = boardMapper.findByBoardId(board.getId());
//		board.setUpdatedBy("panha leap");		
//		board.setHtml(html);
//		
//		boardMapper.updateByBoardId(board);
//		 
//		System.out.println("=======> " + board.toString());
//		return "redirect:/faq/faqBoardDetail?boardId=" + board.getId();
//	}
}
