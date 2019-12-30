package com.mcnc.springmybatis.service.api;

import java.util.List;

import com.mcnc.springmybatis.service.dto.CategoryDTO;
import com.mcnc.springmybatis.service.dto.TypeDTO;

public interface ITypeService {
	public void deleteType(String typeCode);
	public TypeDTO findByTypeCode(String typeCode);
	public List<TypeDTO> getAllTypes();
	public void saveType(TypeDTO type);
	public void updateByTypeCode(TypeDTO type, String oldTypeCode);
}
