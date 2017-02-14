package org.mvc.spring;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.ArrayList;
import java.util.List;


import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import org.mockito.stubbing.Answer;
import org.mvc.spring.product.Product;
import org.mvc.spring.services.ProductServices;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class ProductControllerTester {

	@Mock //mockito mock object
	private ProductServices productService;
	
	@InjectMocks //setups controller and inject mock objects into it
	private ProductController productController;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this); // initializes controller and mocks
		mockMvc = MockMvcBuilders.standaloneSetup(productController).build();
	}
	
	@Test
	public void testList() throws Exception{
		List<Product> products = new ArrayList<>();
		products.add(new Product());
		products.add(new Product());
		
		//specific mockito interaction , tell stub to return listOfProducts
		when(productService.listAllProducts()).thenReturn((List)products);
		
		mockMvc.perform(get("/products/list"))
						.andExpect(status().isOk())
						.andExpect(view().name("products"))
						.andExpect(model().attribute("products",hasSize(2)));
		
	}
	
	@Test
	public void testSaveOrUpdate() throws Exception{
		Integer id =1;
		String description = "testing product";
		double price = 20000.50;
		String imageUrl = "http://www.myshop.com/testing";
		
		Product testingProduct = new Product();
		testingProduct.setId(id);
		testingProduct.setDescription(description);
		testingProduct.setPrice(price);
		testingProduct.setImageUrl(imageUrl);
		
		when(productService.saveOrUpdate(Matchers.<Product>any())).thenReturn(testingProduct);
		mockMvc.perform(post("/product")
						.param("id","1")
						.param("description","testing product")
						.param("price","20000.50")
						.param("imageUrl","http://www.myshop.com/testing"))
						.andExpect(status().is3xxRedirection())
						.andExpect(view().name("redirect:/products/1"))
						.andExpect(model().attribute("product", instanceOf(Product.class)))
						.andExpect(model().attribute("product",hasProperty("id", is(id))))
						.andExpect(model().attribute("product",hasProperty("description", is(description))))
						.andExpect(model().attribute("product",hasProperty("price", is(price))))
						.andExpect(model().attribute("product",hasProperty("imageUrl", is(imageUrl))));
		
		// verify the properties of bound object
		ArgumentCaptor<Product> boundProduct = ArgumentCaptor.forClass(Product.class);
		verify(productService).saveOrUpdate(boundProduct.capture());
		
			assertEquals(id,boundProduct.getValue().getId());
			assertEquals(description,boundProduct.getValue().getDescription());
			assertEquals(price,boundProduct.getValue().getPrice(),0.0);
			assertEquals(imageUrl,boundProduct.getValue().getImageUrl());
			
	}
	
	
}
