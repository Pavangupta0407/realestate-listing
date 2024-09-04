package com.dsg.realestate.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsg.realestate.entities.Property;
import com.dsg.realestate.repositories.PropertyRepository;
import com.dsg.realestate.service.PropertyService;

@Service
public class PropertyServiceImpl implements PropertyService {

	@Autowired
	private PropertyRepository propertyRepository;

	@Override
	public Property createProperty(Property property) {
		property.setCreatedAt(new Date());
		property.setUpdatedAt(new Date());
		return propertyRepository.save(property);
	}

	@Override
	public List<Property> findAllProperties() {
		return propertyRepository.findAll();
	}

	@Override
	public Property updateProperty(Property property) {
		property.setUpdatedAt(new Date());
		return propertyRepository.save(property);
	}

	@Override
	public void deleteProperty(String id) {
		propertyRepository.deleteById(id);
	}

}
