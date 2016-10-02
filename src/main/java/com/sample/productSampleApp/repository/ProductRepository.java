package com.sample.productSampleApp.repository;

import org.springframework.data.repository.CrudRepository;

import com.sample.productSampleApp.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

}
