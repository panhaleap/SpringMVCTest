package com.mcnc.springmybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.mcnc.dao.CategoryMapper;
//import com.mcnc.entity.Category;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mcnc.springmybatis.service.dto.CategoryDTO;
import com.mcnc.springmybatis.service.impl.CategoryService;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Controller 
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	CategoryService categoryService;
	
	private static final String CATEGORY_FOULDER = "category/";
	private static final String CATEGORIES = CATEGORY_FOULDER + "Categories";
//	private static final String ADD = CATEGORY_FOULDER + "Add";
//	private static final String UPDATE = CATEGORY_FOULDER + "Update";
	
	@RequestMapping("/categories")
	public String showListOfCategories(Model model){
		List<CategoryDTO> categories = categoryService.getAllCategories();
		model.addAttribute("categoryList", categories);
		return CATEGORIES;
	}
	
//	@RequestMapping("/showFormForAddCategory")
//	public String addCategory(Model model){
//		model.addAttribute("category", new Category());
//		return ADD;
//	}
//	
//	@RequestMapping("/saveProcess")
//	public String saveCategory(@ModelAttribute("category") Category category){
//		categoryMapper.saveCategory(category);
//		System.out.println("Saved category");
//
//		return "redirect:/category/listOfCategories";
//	}
//	
//	@RequestMapping("/updateCategory")
//	public String updateCategory(@RequestParam("categoryCode") String categoryCode, Model model){
//		Category category = categoryMapper.findByCode(categoryCode);
//		model.addAttribute("category", category);
//		return UPDATE;
//	}
//	
//	@RequestMapping("/saveUpdate")
//	public String saveUpdateCategory(@RequestParam("oldCategoryCode") String oldCategoryCode, @ModelAttribute("category") Category category){
//		categoryMapper.updateByCode(category, oldCategoryCode);
//		System.out.println("Updated category");
//		return "redirect:/category/listOfCategories";
//	}	
//
//	@RequestMapping("/deleteCategory")
//	public String deleteCategory(@RequestParam("categoryCode") String categoryCode){
//		categoryMapper.deleteCategory(categoryCode);
//		return "redirect:/category/listOfCategories";
//	}
}
