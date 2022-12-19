package com.digital.v3.sql.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.digital.v3.sql.vo.CategoryVO;

@Mapper
public interface CategoryMapper {

	// category 레코드 생성
	public void createCategory(CategoryVO categoryVo);
	
	// categoryName으로 category 조회 
	public CategoryVO getCategoryByName(String categoryName);
	
}
