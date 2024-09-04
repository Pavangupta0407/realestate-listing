package com.dsg.realestate.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsg.realestate.entities.Inquiry;
import com.dsg.realestate.repositories.InquiryRepository;
import com.dsg.realestate.service.InquiryService;

@Service
public class InquiryServiceImpl implements InquiryService {
	@Autowired
	private InquiryRepository inquiryRepository;

	@Override
	public Inquiry createInquiry(Inquiry inquiry) {
		inquiry.setCreatedAt(new Date());
		inquiry.setUpdatedAt(new Date());
		return inquiryRepository.save(inquiry);
	}

	@Override
	public List<Inquiry> findInquiriesByPropertyId(String propertyId) {
		 return inquiryRepository.findByPropertyId(propertyId);
	}

	@Override
	public void updateInquiryStatus(String id, String status) {
		Inquiry inquiry = inquiryRepository.findById(id).orElseThrow();
        inquiry.setStatus(status);
        inquiry.setUpdatedAt(new Date());
        inquiryRepository.save(inquiry);
	}

}
