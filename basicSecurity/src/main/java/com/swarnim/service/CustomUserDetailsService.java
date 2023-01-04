package com.swarnim.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.swarnim.model.User1;
import com.swarnim.repository.UserRepository;

public class CustomUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) {
		User1 user = userRepository.findByUsername(username);
		CustomUserDetails customUserDetails =null;
		if(user!=null) {
			customUserDetails = new CustomUserDetails();
			customUserDetails.setUser(user);
		}
		else {
			throw new UsernameNotFoundException("User does'nt exists");
		}
		return null;
	}

}
