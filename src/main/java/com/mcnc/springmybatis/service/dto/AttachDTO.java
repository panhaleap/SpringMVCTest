package com.mcnc.springmybatis.service.dto;

import com.mcnc.springmybatis.util.TrackTimestamp;

public class AttachDTO extends TrackTimestamp{
	private int id;
	private int boardId;
	private BoardDTO board;
	private String name;
	private String originalName;
	private String ext;
	private Long size;
	private String contentType;
	private String path;
	private byte[] data;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public BoardDTO getBoard() {
		return board;
	}
	public void setBoard(BoardDTO board) {
		this.board = board;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOriginalName() {
		return originalName;
	}
	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}
	public String getExt() {
		return ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}
	public Long getSize() {
		return size;
	}
	public void setSize(Long size) {
		this.size = size;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Attach [id=" + id 
				+ ", "+ "boardId=" + boardId 
				+ ", board=" + board 
				+ ", name=" + name 
				+ ", originalName="	+ originalName 
				+ ", ext=" + ext 
				+ ", size=" + size 
				+ ", contentType=" + contentType 
				+ ", path=" + path
				+ ", data=" + data 
				+ ", createdBy=" + getCreatedBy()
				+ ", createdDate=" + getCreatedDate() + "]";
	}	
}
