package com.sample.productSampleApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sample.productSampleApp.model.User;
import com.sample.productSampleApp.service.user.UserDetailServiceImpl;

@Controller
public class LoginController {
	
	@Autowired
	UserDetailServiceImpl userDetailsService;
	
	@RequestMapping(method= RequestMethod.POST ,value ="submitLogin")
	public String login(User user){
		String view = null;
		
		System.out.println("in login method "+user);
		try{
		userDetailsService.loadUserByUsername(user.getUsername());
		view = "/productList";
		}catch(UsernameNotFoundException une){
			System.out.println("user not found error");
			view = "/error";
		}
		return view;
	}

}
