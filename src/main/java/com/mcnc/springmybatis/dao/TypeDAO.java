package com.mcnc.springmybatis.dao;

import java.util.HashMap;
import java.util.List;

import com.mcnc.springmybatis.service.dto.CategoryDTO;
import com.mcnc.springmybatis.service.dto.TypeDTO;

public interface TypeDAO {
	public void deleteType(String typeCode);
	public TypeDTO findByTypeCode(String typeCode);
	public List<TypeDTO> getAllTypes();
	public void saveType(TypeDTO type);
	public void updateByTypeCode(HashMap<String, Object> map);
}
