package com.dsg.realestate.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dsg.realestate.entities.Inquiry;

import java.util.List;

public interface InquiryRepository extends MongoRepository<Inquiry, String> {
    List<Inquiry> findByPropertyId(String propertyId);
    List<Inquiry> findByBuyerId(String buyerId);
}

