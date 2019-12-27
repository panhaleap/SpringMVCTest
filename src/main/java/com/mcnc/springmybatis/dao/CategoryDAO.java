package com.mcnc.springmybatis.dao;

import java.util.List;

import com.mcnc.springmybatis.service.dto.CategoryDTO;

public interface CategoryDAO {
	public List<CategoryDTO> getAllCategories();
}
