package com.dsg.realestate.service;

import java.util.List;

import com.dsg.realestate.entities.Property;

public interface PropertyService {

	Property createProperty(Property property);
	List<Property> findAllProperties();
	Property updateProperty(Property property);
	void deleteProperty(String id);
}
