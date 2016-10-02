package com.sample.productSampleApp.repository;

import org.springframework.data.repository.CrudRepository;

import com.sample.productSampleApp.model.Product;
public interface CategoryRepository extends CrudRepository<Product ,Long>{

}
