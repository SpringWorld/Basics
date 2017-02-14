package org.mvc.spring.services;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.mvc.spring.product.Product;
import org.springframework.stereotype.Service;

import scala.annotation.varargs;

@Service
public class ProductImpl implements ProductServices {

	private Map<Integer,Product> productMap;
	
	public ProductImpl(){
		loadProducts();
	}
	@Override
	public List<Product> listAllProducts() {
		
		return new ArrayList<Product>( this.productMap.values()); 
		}
	
	public void loadProducts(){
		productMap = new LinkedHashMap<>();
		
		Product product1 = new Product();
		product1.setId(1);
		product1.setDescription("jeans");
		product1.setPrice(500.90);
		product1.setImageUrl("http://myshop/jeans/11234454");
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setDescription("t-shirt");
		product2.setPrice(300.90);
		product2.setImageUrl("http://myshop/t_shirts/999999999999991234454");
		
		Product product3 = new Product();
		product3.setId(3);
		product3.setDescription("shoes");
		product3.setPrice(355.90);
		product3.setImageUrl("http://myshop/shoes/909045991234454");
		
		productMap.put(1,product1);
		productMap.put(2,product2);
		productMap.put(3,product3);
	}
	@Override
	public Product getProduct(int id) {
		
		return this.productMap.get(id);
	}
	@Override
	public Product saveOrUpdate(Product product) {
		if(product!=null){
			if(product.getId() == null){
				product.setId(this.productMap.size()+1);
			}
			this.productMap.put(product.getId(), product);
			return product;
		}else{
			throw new RuntimeException("product can't be nill");
		}
		
		
	}
	@Override
	public void delete(int id) {
		if(this.productMap.get(id) != null){
			this.productMap.remove(id);
		}else{
			throw new RuntimeException("invalid product number , delete can't be performed");
		}
	}

}
