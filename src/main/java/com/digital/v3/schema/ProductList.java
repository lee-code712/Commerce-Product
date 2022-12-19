package com.digital.v3.schema;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.ArraySchema;

@ArraySchema
public class ProductList {

	@ApiModelProperty(required = false, position = 1, notes = "상품 목록", example = "", dataType = "array")
	private List<Product> products;

	public List<Product> getProducts() {
		List<Product> products = this.products;
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
