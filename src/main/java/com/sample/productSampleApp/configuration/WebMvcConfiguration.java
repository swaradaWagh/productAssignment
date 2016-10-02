package com.sample.productSampleApp.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfiguration extends WebMvcConfigurerAdapter{

	@Override
    public void addViewControllers(ViewControllerRegistry registry) {
	    registry.addViewController("/").setViewName("/Login");
        registry.addViewController("/addProduct").setViewName("/product/createProduct");
        registry.addViewController("/productList").setViewName("/product/productList");
        registry.addViewController("/updateProduct").setViewName("/product/createProduct");
        registry.addViewController("/showUpdateProduduct").setViewName("showUpdateProduduct");
        registry.addStatusController("/error", HttpStatus.BAD_REQUEST);
    }
}
