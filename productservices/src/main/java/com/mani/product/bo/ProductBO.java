package com.mani.product.bo;

import com.mani.product.dto.Product;

public interface ProductBO {
	
	void create(Product product);
	Product findProduct(int id);
}
