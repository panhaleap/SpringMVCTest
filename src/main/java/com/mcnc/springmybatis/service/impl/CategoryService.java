package com.mcnc.springmybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mcnc.springmybatis.dao.CategoryDAO;
import com.mcnc.springmybatis.service.api.ICategoryService;
import com.mcnc.springmybatis.service.dto.CategoryDTO;

public class CategoryService implements ICategoryService{

	@Autowired
	CategoryDAO categoryDAO;
	@Override
	public List<CategoryDTO> getAllCategories() {
		// TODO Auto-generated method stub
		return categoryDAO.getAllCategories();
	}
	
	@Override
	public void saveCategory(CategoryDTO category) {
		categoryDAO.saveCategory(category);
	}

//	@Autowired
//	private ICategoryDAO categoryDAO;
//
//	public List<CategoryDTO> getAllCategories() {
//		return categoryDAO.getAllCategories();
//	}
//	
//	public void updateByCode(Category category, String oldCategoryCode){
//		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
//		HashMap<String, Object> map=new HashMap<String, Object>();
//		map.put("category", category);
//		map.put("oldCategoryCode", oldCategoryCode);		
//		session.update("updateByCode", map);
//		session.commit();
//		session.close();
//	}
//	
//	public void deleteCategory(String categoryCode){
//		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
//		session.delete("deleteCategory", categoryCode);
//		session.commit();
//		session.close();
//	}
//	

//	
//	public Category findByCode(String categoryCode){
//		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
//		Category category = (Category) session.selectOne("findByCode", categoryCode);
//		session.commit();
//		session.close();
//		return category;
//	}
//	
//	//Test CKEditor Comment
//	public void saveCategoryTestCKEditor(Category category){
//		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
//		session.insert("insertCategoryTestCKEditor", category);
//		session.commit();
//		session.close();
//	}
//	
//	public Category findByCodeCKEditor(String categoryCode){
//		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
//		Category category = (Category) session.selectOne("findByCodeCKEditor", categoryCode);
//		session.commit();
//		session.close();
//		return category;
//	}
//	
//	public void updateByCodeCKEditor(Category category, String oldCategoryCode){
//		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
//		HashMap<String, Object> map=new HashMap<String, Object>();
//		map.put("category", category);
//		map.put("oldCategoryCode", oldCategoryCode);		
//		session.update("updateByCodeCKEditor", map);
//		session.commit();
//		session.close();
//	}
}
