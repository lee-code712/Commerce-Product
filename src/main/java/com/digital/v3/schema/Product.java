package com.digital.v3.schema;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Product {
	
	@ApiModelProperty(required = false, position = 1, notes = "상품 ID", example = "0", dataType = "long")
	private long productId;
	
	@ApiModelProperty(required = true, position = 2, notes = "상품 카테고리 ID", example = "0", dataType = "long")
	private long categoryId;
	
	@ApiModelProperty(required = true, position = 3, notes = "상품명", example = "상품명", dataType = "string")
	private String productName;
	
	@ApiModelProperty(required = true, position = 4, notes = "상품 가격", example = "1000", dataType = "long")
	private long price;
	
	
	public long getProductId() {
		long productId = this.productId;
		return productId;
	}
	
	public void setProductId(long productId) {
		this.productId = productId;
	}
	
	public long getCategoryId() {
		long categoryId = this.categoryId;
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	
	public String getProductName() {
		String productName = this.productName;
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public long getPrice() {
		long price = this.price;
		return price;
	}
	
	public void setPrice(long price) {
		this.price = price;
	}
	
}
