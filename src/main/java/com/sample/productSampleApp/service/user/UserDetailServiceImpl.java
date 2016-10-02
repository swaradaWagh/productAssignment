package com.sample.productSampleApp.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sample.productSampleApp.repository.user.UserRepository;

@Service("productUserDetailsService")
public class UserDetailServiceImpl implements UserDetailsService {

	@Autowired 
	UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String userName)
			throws UsernameNotFoundException {
		UserDetails user = userRepo.findUserByUserName(userName);
		System.out.println("user____"+user);
		if(user==null){
			throw new UsernameNotFoundException("User with"+user+"not found");
		}
		return user;
	}

}
