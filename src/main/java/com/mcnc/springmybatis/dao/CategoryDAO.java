package com.mcnc.springmybatis.dao;

import java.util.HashMap;
import java.util.List;

import com.mcnc.springmybatis.service.dto.CategoryDTO;

public interface CategoryDAO {
	public List<CategoryDTO> getAllCategories();
	public void saveCategory(CategoryDTO category);
	public CategoryDTO findByCode(String categoryCode);
	public void updateByCode(HashMap<String, Object> map);
	public void deleteCategory(String categoryCode);
}
