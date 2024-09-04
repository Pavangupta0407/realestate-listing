package com.dsg.realestate.service;

import java.util.List;

import com.dsg.realestate.entities.Inquiry;

public interface InquiryService {

	Inquiry createInquiry(Inquiry inquiry);
	List<Inquiry> findInquiriesByPropertyId(String propertyId);
	void updateInquiryStatus(String id, String status);
}
