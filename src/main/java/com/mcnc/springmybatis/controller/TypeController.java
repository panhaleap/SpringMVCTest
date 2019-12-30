package com.mcnc.springmybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mcnc.springmybatis.service.dto.CategoryDTO;
import com.mcnc.springmybatis.service.dto.TypeDTO;
import com.mcnc.springmybatis.service.impl.CategoryService;
import com.mcnc.springmybatis.service.impl.TypeService;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
@RequestMapping("/type")
public class TypeController {
	
	private static final String TYPE_FOULDER = "type/";
	private static final String TYPELIST = TYPE_FOULDER + "Types";
	private static final String ADD = TYPE_FOULDER + "Add";
	private static final String UPDATE = TYPE_FOULDER + "Update";
	@Autowired
	TypeService typeService;
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping("/listOfTypes")
	public String showListOfTypes(Model model){
		List<TypeDTO> types = typeService.getAllTypes();		 
		model.addAttribute("typeList", types);
		return TYPELIST;
	}
	
	@RequestMapping("/showFormForAddType")
	public String addCategory(Model model){
		List<CategoryDTO> categories = categoryService.getAllCategories();
		model.addAttribute("type", new TypeDTO());
		model.addAttribute("categories", categories);
		return ADD;
	}
	
	@RequestMapping("/saveProcess")
	public String saveCategory(@ModelAttribute("type") TypeDTO type){
		typeService.saveType(type);
		System.out.println("Saved type");
		return "redirect:/type/listOfTypes";
	}
	
	@RequestMapping("/updateType")
	public String updateCategory(@RequestParam("typeCode") String typeCode, Model model){
		TypeDTO type = typeService.findByTypeCode(typeCode);
		List<CategoryDTO> categories = categoryService.getAllCategories();
		model.addAttribute("type", type);
		model.addAttribute("categories", categories);
		return UPDATE;
	}
	
	@RequestMapping("/saveUpdate")
	public String saveUpdateCategory(@RequestParam("oldTypeCode") String oldTypeCode, @ModelAttribute("type") TypeDTO type){
		typeService.updateByTypeCode(type, oldTypeCode);
		System.out.println("Updated type");
		return "redirect:/type/listOfTypes";
	}	

	@RequestMapping("/deleteType")
	public String deleteType(@RequestParam("typeCode") String typeCode){
		typeService.deleteType(typeCode);
		return "redirect:/type/listOfTypes";
	}
}
