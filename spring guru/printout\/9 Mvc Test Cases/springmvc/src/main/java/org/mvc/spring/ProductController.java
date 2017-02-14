package org.mvc.spring;

import org.mvc.spring.product.Product;
import org.mvc.spring.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {

	private ProductServices productServices;
	
	@Autowired
	public void setProductServices(ProductServices productServices) {
		this.productServices = productServices;
	}
	
	@RequestMapping("/products/list")	
	public String listProducts(Model model){
		model.addAttribute("products",this.productServices.listAllProducts());
		return "products";
	}
	
	@RequestMapping("/products/{id}")
	public String getProduct(@PathVariable Integer id,Model model){
		model.addAttribute("product",this.productServices.getProduct(id));
		return "product";
	}
	
	@RequestMapping("/products/new")
	public String newProduct(Model model){
		model.addAttribute("product",new Product());
		return "productForm";
	}
	
	@RequestMapping(value="/product/edit/{id}")
	public String edit(@PathVariable Integer id,Model model){
		model.addAttribute("product",this.productServices.getProduct(id));
		
		return "productForm";
	}
	
	@RequestMapping(value="/product",method=RequestMethod.POST)
	public String saveOrUpdate(Product product){
		Product savedProduct=this.productServices.saveOrUpdate(product);
		
		return "redirect:/products/"+savedProduct.getId();
	}
	
	@RequestMapping(value="/product/delete/{id}")
	public String delete(@PathVariable Integer id,Model model){
		this.productServices.delete(id);
		
		return "redirect:/products/";
	}
}
