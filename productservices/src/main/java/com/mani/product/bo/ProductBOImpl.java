package com.mani.product.bo;

import com.mani.product.dao.ProductDAO;
import com.mani.product.dao.ProductDAOImpl;
import com.mani.product.dto.Product;

public class ProductBOImpl implements ProductBO {
	
	private static ProductDAO dao = new ProductDAOImpl();

	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
