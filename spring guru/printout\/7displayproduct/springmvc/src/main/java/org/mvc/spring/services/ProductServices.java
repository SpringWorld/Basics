package org.mvc.spring.services;

import java.util.List;

import org.mvc.spring.product.Product;

public interface ProductServices {

	List<Product> listAllProducts(); 
	
	Product getProduct(int id);
}
