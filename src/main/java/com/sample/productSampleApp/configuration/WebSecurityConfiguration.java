package com.sample.productSampleApp.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.access.channel.ChannelProcessingFilter;
import org.springframework.web.filter.CompositeFilter;

import com.sample.productSampleApp.service.user.UserDetailServiceImpl;

@Configuration
@EnableWebSecurity
@EnableAutoConfiguration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	@Autowired
    @Qualifier("productUserDetailsService")
    UserDetailServiceImpl userDetailServiceImpl;	

    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	   http.addFilterBefore(new CompositeFilter(), ChannelProcessingFilter.class).csrf().disable()
           .headers().disable().authorizeRequests().antMatchers(HttpMethod.OPTIONS, "/**")
           .permitAll();
       http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

    }

    
	   @Autowired
	    protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		   System.out.println("in security");
		   DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
	        provider.setUserDetailsService(userDetailServiceImpl);
	        auth.userDetailsService(userDetailServiceImpl)
	            .passwordEncoder(new BCryptPasswordEncoder());
	      }


	  

}
