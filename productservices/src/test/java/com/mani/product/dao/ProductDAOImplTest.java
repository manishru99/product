package com.mani.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mani.product.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void createShouldCreateAProduct() {
		ProductDAO dao = new ProductDAOImpl();
		Product product = new Product();
		product.setId(1);
		product.setName("iPhone");
		product.setDescription("Awesome");
		product.setPrice(800);
		dao.create(product);
		Product result = dao.read(1);
		assertNotNull(result);  //asserts are static methods, using this methods we can verify the results
		assertEquals("iPhone",result.getName());
	}

}
