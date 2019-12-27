package com.mcnc.springmybatis.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mcnc.springmybatis.dao.CategoryDAO;
import com.mcnc.springmybatis.service.api.ICategoryService;
import com.mcnc.springmybatis.service.dto.CategoryDTO;

public class CategoryService implements ICategoryService{

	@Autowired
	CategoryDAO categoryDAO;
	@Override
	public void deleteCategory(String categoryCode){
		categoryDAO.deleteCategory(categoryCode);
	}
	
	@Override
	public CategoryDTO findByCode(String categoryCode){
		CategoryDTO category = categoryDAO.findByCode(categoryCode);
		return category;
	}

	@Override
	public List<CategoryDTO> getAllCategories() {
		// TODO Auto-generated method stub
		return categoryDAO.getAllCategories();
	}
	
	@Override
	public void saveCategory(CategoryDTO category) {
		categoryDAO.saveCategory(category);
	}
	

	@Override
	public void updateByCode(CategoryDTO category, String oldCategoryCode){
		HashMap<String, Object> map=new HashMap<String, Object>();
		map.put("category", category);
		map.put("oldCategoryCode", oldCategoryCode);		
		categoryDAO.updateByCode(map);
	}
}
