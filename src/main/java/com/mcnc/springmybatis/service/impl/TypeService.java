package com.mcnc.springmybatis.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.PlatformTransactionManager;

import com.mcnc.springmybatis.dao.TypeDAO;
import com.mcnc.springmybatis.service.api.ITypeService;
import com.mcnc.springmybatis.service.dto.TypeDTO;

public class TypeService implements ITypeService{

	@Autowired
	TypeDAO typeDAO;
	@Autowired
	PlatformTransactionManager platformTransactionManager;
	@Override
	public void deleteType(String typeCode){
		typeDAO.deleteType(typeCode);
	}
	
	@Override
	public TypeDTO findByTypeCode(String typeCode) {
		return typeDAO.findByTypeCode(typeCode);
	}

	@Override
	public List<TypeDTO> getAllTypes() {
		// TODO Auto-generated method stub
		return typeDAO.getAllTypes();
	}
	
	@Override
	public void saveType(TypeDTO type) {
		typeDAO.saveType(type);
	}
	
	@Override
	public void updateByTypeCode(TypeDTO type, String oldTypeCode){
		HashMap<String, Object> map=new HashMap<String, Object>();
		map.put("type", type);
		map.put("oldTypeCode", oldTypeCode);
		typeDAO.updateByTypeCode(map);
	}
}
