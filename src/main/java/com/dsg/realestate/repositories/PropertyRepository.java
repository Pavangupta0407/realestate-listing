package com.dsg.realestate.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dsg.realestate.entities.Property;

import java.util.List;

public interface PropertyRepository extends MongoRepository<Property, String> {
    List<Property> findByCity(String city);
    List<Property> findByPriceBetween(double minPrice, double maxPrice);
    List<Property> findByBedrooms(int bedrooms);
    List<Property> findByType(String type);
}

