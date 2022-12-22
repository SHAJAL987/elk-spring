package com.elasticsearch.api.service;

import com.elasticsearch.api.payload.CustomerDto;

public interface CustomerService {
    CustomerDto createCustomer(CustomerDto customerDto);
}
