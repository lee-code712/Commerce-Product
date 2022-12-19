package com.digital.v3.sql.vo;

import lombok.Data;

@Data
public class ProductVO {

	private long productId;
	private String productName;
	private long price;
	private CategoryVO categoryVo;
	private long quantity;
	
	public long getProductId() {
		long productId = this.productId;
		return productId;
	}
	
	public String getProductName() {
		String productName = this.productName;
		return productName;
	}
	
	public long getPrice() {
		long price = this.price;
		return price;
	}
	
	public CategoryVO getCategoryVo() {
		CategoryVO categoryVo = this.categoryVo;
		return categoryVo;
	}
	
	public long getQuantity() {
		long quantity = this.quantity;
		return quantity;
	}
	
}
