package com.mcnc.springmybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mcnc.springmybatis.service.dto.CategoryDTO;
import com.mcnc.springmybatis.service.impl.CategoryService;

@Controller 
@RequestMapping("/test")
public class TestRespondBodyAsJSON {
	
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping(value = "/getAllCategoriesJSON", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<CategoryDTO> getAllCategories(){
		List<CategoryDTO> categories = categoryService.getAllCategories();
		return categories;
	}
	
	@RequestMapping("/categoryForm")
	public String showForm(Model model){
		return "testAjax/testAjax";
	}
	
	/*---Add new category---*/
	@PostMapping("/saveCategory")
	public ResponseEntity<?> save(@RequestBody CategoryDTO category) {
		categoryService.saveCategory(category);
		return ResponseEntity.ok().body("New category has been saved with code:" + category.getCode());
	}	
}
