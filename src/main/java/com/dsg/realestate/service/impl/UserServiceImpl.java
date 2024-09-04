package com.dsg.realestate.service.impl;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsg.realestate.entities.User;
import com.dsg.realestate.repositories.UserRepository;
import com.dsg.realestate.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User registerUser(User user) {
		user.setCreatedAt(new Date());
		user.setUpdatedAt(new Date());
		return userRepository.save(user);
	}

	@Override
	public Optional<User> findByUsername(String username) {
		 return userRepository.findByUsername(username);
	}

}
