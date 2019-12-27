package com.mcnc.springmybatis.service.dto;

public class CategoryDTO {
	private String code;
	private String name;
	private String desc;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Category [code=" + code + ", name=" + name + ", desc=" + desc + "]";
	}
	
}
