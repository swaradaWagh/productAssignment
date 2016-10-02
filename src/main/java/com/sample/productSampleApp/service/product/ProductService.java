package com.sample.productSampleApp.service.product;

import java.util.List;

import com.sample.productSampleApp.dto.ProductDto;
import com.sample.productSampleApp.model.Product;

public interface ProductService {
	
	public List<Product> getAllProducts();
	
	public boolean saveProduct(ProductDto productDto);
	
	public void updateProduct(ProductDto productDto);
	
	public Product getProductByProductid(long productId);
	
	

}
