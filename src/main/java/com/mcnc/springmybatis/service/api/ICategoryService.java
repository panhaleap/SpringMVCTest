package com.mcnc.springmybatis.service.api;

import java.util.List;

import com.mcnc.springmybatis.service.dto.CategoryDTO;

public interface ICategoryService {
	public List<CategoryDTO> getAllCategories();
	public void saveCategory(CategoryDTO category);
}
