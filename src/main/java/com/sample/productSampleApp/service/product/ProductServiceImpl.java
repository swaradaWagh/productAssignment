package com.sample.productSampleApp.service.product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.productSampleApp.dto.ProductDto;
import com.sample.productSampleApp.model.Product;
import com.sample.productSampleApp.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepo;
	

	@Override
	public List<Product> getAllProducts() {
	List<Product>	productList = new ArrayList<Product>();
	  Iterable<Product> productIterable = productRepo.findAll();
	  Iterator<Product> productIterator = productIterable.iterator();
	  while(productIterator.hasNext()){
		 productList.add(productIterator.next());
	  }
	  return productList;
	}
	
	public boolean saveProduct(ProductDto productDto){
		boolean isSaved = false;
		Product product = new Product();
		BeanUtils.copyProperties(productDto, product);
		Product savedProduct = productRepo.save(product);
		if(savedProduct.getProductId()!=0){
			isSaved = true;
		}
	     return isSaved;
	}

	@Override
	public void updateProduct(ProductDto productDto) {
		long productId = Long.parseLong(productDto.getInputId());
		Product p = productRepo.findOne(productId);
		BeanUtils.copyProperties(productDto, p);
		productRepo.save(p);
	}
	
	
	public Product getProductByProductid(long productId){
		Product p = productRepo.findOne(productId);
		return p;
	}

}
