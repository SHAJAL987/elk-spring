package com.elasticsearch.api.repository;

import com.elasticsearch.api.model.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface CustomerRepository extends ElasticsearchRepository<Customer,String> {

}
