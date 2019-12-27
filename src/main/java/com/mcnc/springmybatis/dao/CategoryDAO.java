package com.mcnc.springmybatis.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mcnc.springmybatis.service.dto.CategoryDTO;

public interface CategoryDAO {
	public List<CategoryDTO> getAllCategories();
}
