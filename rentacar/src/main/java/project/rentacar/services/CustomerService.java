package project.rentacar.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.rentacar.entities.Customer;
import project.rentacar.repositories.CustomerRepository;
import project.rentacar.requests.CustomerUpdateRequest;
import project.rentacar.responses.CustomerResponse;

@Service
public class CustomerService {

	private CustomerRepository customerRepository;
	
	@Autowired
	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public Customer createCustomer(Customer customer) {
		if(customer.getAge() >= 18) {
		return this.customerRepository.save(customer);
		}
		else
			return null;
	}

	public List<CustomerResponse> getAllCustomers() {
		List<Customer> customers;
		customers = this.customerRepository.findAll();
		return customers.stream().map(customer ->new CustomerResponse(customer)).collect(Collectors.toList());
	}

	public Customer getCustomerById(int customerId) {
		return this.customerRepository.findById(customerId).orElse(null);
	}
	
	public Customer updateCustomer(int customerId, CustomerUpdateRequest customerUpdateRequest) {
		Optional<Customer> customer = customerRepository.findById(customerId);
		if(customer.isPresent()) {
			Customer updatedCustomer = customer.get();
			updatedCustomer.setEmail(customerUpdateRequest.getEmail());
			updatedCustomer.setPassword(customerUpdateRequest.getPassword());
			return this.customerRepository.save(updatedCustomer);
		} else
		return null;
	}
}
