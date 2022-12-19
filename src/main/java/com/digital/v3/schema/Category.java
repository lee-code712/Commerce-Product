package com.digital.v3.schema;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Category {
//	categoryId (long)
//	categoryName (String)
	
	@ApiModelProperty(required = false, position = 1, notes = "상품 카테고리 ID", example = "0", dataType = "long")
	private long categoryId;
	
	@ApiModelProperty(required = true, position = 2, notes = "카테고리명", example = "카테고리명", dataType = "string")
	private String categoryName;

	public long getCategoryId() {
		long categoryId = this.categoryId;
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		String categoryName = this.categoryName;
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
}
