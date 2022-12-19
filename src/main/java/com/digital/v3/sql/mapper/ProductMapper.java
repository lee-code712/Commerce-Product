package com.digital.v3.sql.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.digital.v3.sql.vo.ProductVO;

@Mapper
public interface ProductMapper {

	// product 레코드 생성
	public void createProduct(ProductVO productVo);
	
	// productName으로 product 조회
	public ProductVO getProductByName(String productName);
	
	// productName keyword로 product 목록 조회
	public List<ProductVO> getProductByKeyword(String keyword);
	
	// categoryName으로 product 목록 조회
	public List<ProductVO> getProductByCategory(String categoryName);
	
}
