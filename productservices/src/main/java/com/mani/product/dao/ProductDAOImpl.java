//for this class right click prod.dao and click 
//create class then give appropriate name then Add..
//In choose interfaces select product
//Eclipse will generate all the methods you'll need to implement


package com.mani.product.dao;

import java.util.HashMap;
import java.util.Map;

import com.mani.product.dto.Product;

public class ProductDAOImpl implements ProductDAO {
	
	Map<Integer,Product> products = new HashMap<>();

	@Override
	public void create(Product product) {
		// TODO Auto-generated method stub
		products.put(product.getId(), product); //every time create method is invoked 
		//then product will be put into the map using id as the key and product 
		//as the value
	}

	@Override
	public Product read(int id) {
		// TODO Auto-generated method stub
		
		return products.get(id);
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
