package com.sample.productSampleApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.sample.productSampleApp.dto.ProductDto;
import com.sample.productSampleApp.model.Product;
import com.sample.productSampleApp.service.product.ProductService;



@Controller
public class ProductController extends WebMvcConfigurerAdapter {
	
	@Autowired
	ProductService productService;
	
	
	 @RequestMapping(method= RequestMethod.GET , value = "/showAddProduduct")
	 public String showAddProduct(){
		return "showAddProduduct";
	 }
	 
	
	 @RequestMapping(method = RequestMethod.GET , value ="/showEditProduct")
	 public String getProductToUpdate(@RequestBody long productId ,ModelMap modelMap){
		 System.out.println("in showedit");
		 Product p = productService.getProductByProductid(productId);
		 modelMap.addAttribute("product",p);
   		 return "showUpdateProduduct";
	 }
	 
	@RequestMapping(method=RequestMethod.POST,value="/productList")
    public ModelAndView getAllProducts() {
		System.out.println("in productList");
		List<Product> productList = productService.getAllProducts();
		ModelAndView modelAndView = new ModelAndView("/product/productList");
		modelAndView.addObject("productList", productList);    
		return modelAndView;
		}
	
	@RequestMapping(method=RequestMethod.POST ,value="/addProduct")
	public String createProduct(@ModelAttribute("product")ProductDto productDto ,ModelMap modelmap){
		productService.saveProduct(productDto);
		modelmap.addAttribute("added","Product Added Successfully");
		return "addProduct";
	}
	
	@RequestMapping(method=RequestMethod.PUT ,value="/editProduct")
	public String updateProduct(@RequestBody ProductDto productDto,ModelMap modelmap){
		productService.updateProduct(productDto);
		modelmap.addAttribute("updated","Product updated Successfully");
		return "updateProduct";
	}


}
