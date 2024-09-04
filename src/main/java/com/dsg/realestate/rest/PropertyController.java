package com.dsg.realestate.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.dsg.realestate.entities.Property;
import com.dsg.realestate.service.PropertyService;

import java.util.List;

@RestController
@RequestMapping("/api/properties")
public class PropertyController {
	@Autowired
	private PropertyService propertyService;

	@PostMapping
	public ResponseEntity<Property> createProperty(@RequestBody Property property) {
		Property createdProperty = propertyService.createProperty(property);
		return ResponseEntity.ok(createdProperty);
	}

	@GetMapping
	public ResponseEntity<List<Property>> getAllProperties() {
		List<Property> properties = propertyService.findAllProperties();
		return ResponseEntity.ok(properties);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Property> updateProperty(@PathVariable String id, @RequestBody Property property) {
		property.setId(id);
		Property updatedProperty = propertyService.updateProperty(property);
		return ResponseEntity.ok(updatedProperty);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteProperty(@PathVariable String id) {
		propertyService.deleteProperty(id);
		return ResponseEntity.noContent().build();
	}
}
