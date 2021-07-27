package com.mani.product.dao;

import com.mani.product.dto.Product;

public interface ProductDAO {
	void create(Product product);  //Ctrl+1 for importing package above by selecting Product
	Product read(int id);  //read method should take int id and return Product
	void update(Product product);
	void delete(int id);
}
