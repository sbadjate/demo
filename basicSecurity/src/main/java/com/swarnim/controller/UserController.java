package com.swarnim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swarnim.model.User1;
import com.swarnim.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@PreAuthorize("hasAnyRole('ADMIN')")
	@PostMapping
	public String addUser(@RequestBody User1 user) {
		String password = user.getPassword();
		String encPwd = bCryptPasswordEncoder.encode(password);
		user.setPassword(encPwd);
		userRepository.save(user);
		return "User Added";
	}
}
