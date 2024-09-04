package com.dsg.realestate.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.dsg.realestate.entities.User;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByUsername(String username);
}
