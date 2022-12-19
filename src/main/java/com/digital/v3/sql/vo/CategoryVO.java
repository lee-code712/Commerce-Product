package com.digital.v3.sql.vo;

import lombok.Data;

@Data
public class CategoryVO {

	private long categoryId;
	private String categoryName;
	
	public long getCategoryId() {
		long categoryId = this.categoryId;
		return categoryId;
	}
	
	public String getCategoryName() {
		String categoryName = this.categoryName;
		return categoryName;
	}	
	
}
