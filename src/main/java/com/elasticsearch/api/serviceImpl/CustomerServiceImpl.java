package com.elasticsearch.api.serviceImpl;

import com.elasticsearch.api.model.Customer;
import com.elasticsearch.api.payload.CustomerDto;
import com.elasticsearch.api.repository.CustomerRepository;
import com.elasticsearch.api.service.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        Customer newCustomer = new Customer();
        newCustomer.setFirst_name(customerDto.getFirst_name());
        newCustomer.setLast_name(customerDto.getLast_name());
        newCustomer.setAge(customerDto.getAge());

        Customer returnObj = customerRepository.save(newCustomer);

        customerDto.setId(returnObj.getId());
        customerDto.setFirst_name(returnObj.getFirst_name());
        customerDto.setLast_name(returnObj.getLast_name());
        customerDto.setAge(returnObj.getAge());
        customerDto.setRes_code("100");
        customerDto.setRes_msg("Operation Successfully.");


        return customerDto;
    }
}
