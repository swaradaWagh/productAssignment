package com.sample.productSampleApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.core.Ordered;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@EnableGlobalMethodSecurity(prePostEnabled = true, order = Ordered.HIGHEST_PRECEDENCE)
@SpringBootApplication
public class Application extends SpringBootServletInitializer
{
	
	
      	@Override
    	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    		return application.sources(Application.class);
    	}

    	public static void main(String[] args) throws Exception {
    		SpringApplication.run(Application.class, args);
    }
    
}
