package com.dsg.realestate.service;

import java.util.Optional;

import com.dsg.realestate.entities.User;

public interface UserService {

	User registerUser(User user);
	Optional<User> findByUsername(String username);
}
