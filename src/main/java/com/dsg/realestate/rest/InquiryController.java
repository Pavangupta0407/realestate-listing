package com.dsg.realestate.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.dsg.realestate.entities.Inquiry;
import com.dsg.realestate.service.InquiryService;

import java.util.List;

@RestController
@RequestMapping("/api/inquiries")
public class InquiryController {
	@Autowired
	private InquiryService inquiryService;

	@PostMapping
	public ResponseEntity<Inquiry> createInquiry(@RequestBody Inquiry inquiry) {
		Inquiry createdInquiry = inquiryService.createInquiry(inquiry);
		return ResponseEntity.ok(createdInquiry);
	}

	@GetMapping("/{propertyId}")
	public ResponseEntity<List<Inquiry>> getInquiriesByPropertyId(@PathVariable String propertyId) {
		List<Inquiry> inquiries = inquiryService.findInquiriesByPropertyId(propertyId);
		return ResponseEntity.ok(inquiries);
	}

	@PutMapping("/{id}/status")
	public ResponseEntity<Void> updateInquiryStatus(@PathVariable String id, @RequestBody String status) {
		inquiryService.updateInquiryStatus(id, status);
		return ResponseEntity.noContent().build();
	}
}
