package com.digital.v3.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.digital.v3.schema.Product;
import com.digital.v3.schema.ProductList;
import com.digital.v3.sql.mapper.ProductMapper;
import com.digital.v3.sql.vo.CategoryVO;
import com.digital.v3.sql.vo.ProductVO;

@Component
public class ProductService {
	
	@Autowired
	ProductMapper productMapper;
	
	/* 상품 등록 */
	public boolean productWrite (Product product) throws Exception {
		try {
			// product 중복 여부 확인
			if (productMapper.getProductByName(product.getProductName()) != null) {
				throw new Exception("이미 등록된 상품입니다.");
			}
			
			// 중복이 아니면 write
			product.setProductId(System.currentTimeMillis());
			ProductVO productVo = setProductVO(product);
			
			productMapper.createProduct(productVo);
			return true;
		} catch (Exception e) {
			throw e;
		}
	}

	/* 상품 검색 - productName */
	public Product productSearch (String productName) throws Exception {

		ProductVO productVo = productMapper.getProductByName(productName);
		
		Product product = new Product();
		if (productVo != null) {
			product = setProduct(productVo);
		}
		
		return product;
	}

	/* 상품 검색 - keyword */
	public ProductList productSearchByKeyword (String keyword) throws Exception {
		
		List<ProductVO> productVoList = productMapper.getProductByKeyword(keyword);
		
		ProductList productList = new ProductList(); 
		List<Product> products = new ArrayList<Product>();
		for (ProductVO productVo : productVoList) {
			Product product = setProduct(productVo);	
			products.add(product);
		}
		productList.setProducts(products);
		
		return productList;
	}
	
	/* 상품 검색 - categoryName */
	public ProductList productSearchByCategory (String categoryName) throws Exception {
		
		List<ProductVO> productVoList = productMapper.getProductByCategory(categoryName);
		
		ProductList productList = new ProductList(); 
		List<Product> products = new ArrayList<Product>();
		for (ProductVO productVo : productVoList) {
			Product product = setProduct(productVo);	
			products.add(product);
		}
		productList.setProducts(products);
		
		return productList;
	}
	
	public Product setProduct (ProductVO productVo) {
		Product product = new Product();		
		
		product.setProductId(productVo.getProductId());
		product.setCategoryId(productVo.getCategoryVo().getCategoryId());
		product.setProductName(productVo.getProductName());
		product.setPrice(productVo.getPrice());
		
		return product;
	}
	
	public ProductVO setProductVO (Product product) {
		ProductVO productVo = new ProductVO();		
		
		productVo.setProductId(product.getProductId());
		productVo.setProductName(product.getProductName());
		productVo.setPrice(product.getPrice());
		
		// categoryVo set
		CategoryVO categoryVo = new CategoryVO();
		categoryVo.setCategoryId(product.getCategoryId());
		productVo.setCategoryVo(categoryVo);
		
		return productVo;
	}

}
