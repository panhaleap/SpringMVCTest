package com.mcnc.springmybatis.service.api;

import java.util.List;

import com.mcnc.springmybatis.service.dto.CategoryDTO;

public interface ICategoryService {
	public void deleteCategory(String categoryCode);
	public CategoryDTO findByCode(String categoryCode);
	public List<CategoryDTO> getAllCategories();
	public void saveCategory(CategoryDTO category);
	public void updateByCode(CategoryDTO category, String oldCategoryCode);
}
