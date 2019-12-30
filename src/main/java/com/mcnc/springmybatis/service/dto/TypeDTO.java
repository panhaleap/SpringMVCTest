package com.mcnc.springmybatis.service.dto;

import org.springframework.beans.factory.annotation.Autowired;

import com.mcnc.springmybatis.service.impl.CategoryService;

public class TypeDTO {
	private String code;
	private String name;
	private String desc;
	private String categoryCode;
	private CategoryDTO category;
	@Autowired
	CategoryService categoryService;
	
	public CategoryDTO getCategory() {
		return category;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public String getCode() {
		return code;
	}
	public String getDesc() {
		return desc;
	}
	public String getName() {
		return name;
	}
	public void setCategory() {
		this.category = categoryService.findByCode(categoryCode);
	}
	
	public void setCategory(CategoryDTO category) {
		this.category = category;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "TypeDTO [code=" + code + ", name=" + name 
				+ ", desc=" + desc + ", categoryCode=" + categoryCode + "]";
	}
}
