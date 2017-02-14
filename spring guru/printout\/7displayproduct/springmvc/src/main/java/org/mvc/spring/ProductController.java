package org.mvc.spring;

import org.mvc.spring.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	private ProductServices productServices;
	
	@Autowired
	public void setProductServices(ProductServices productServices) {
		this.productServices = productServices;
	}
	
	@RequestMapping("/products")
	public String listProducts(Model model){
		model.addAttribute("products",this.productServices.listAllProducts());
		return "products";
	}
	
	@RequestMapping("/products/{id}")
	public String listProducts(@PathVariable Integer id,Model model){
		model.addAttribute("product",this.productServices.getProduct(id));
		return "product";
	}
}
