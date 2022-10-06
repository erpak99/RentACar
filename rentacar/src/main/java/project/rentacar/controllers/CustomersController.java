package project.rentacar.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.rentacar.entities.Customer;
import project.rentacar.requests.CustomerUpdateRequest;
import project.rentacar.responses.CustomerResponse;
import project.rentacar.services.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomersController {

	private CustomerService customerService;
	
	public CustomersController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@PostMapping("/create")
	public Customer createCustomer(@RequestBody Customer customer) {
		return this.customerService.createCustomer(customer);
	}
	
	@GetMapping("/getall")
	public List<CustomerResponse> getAllCustomers() {
		return this.customerService.getAllCustomers();
	}
	
	@GetMapping("/getbyid/{customerId}")
	public Customer getCustomerById(@PathVariable int customerId) {
		return this.customerService.getCustomerById(customerId);
	}
	
	@PutMapping("/{customerId}")
	public Customer updateCustomer(@PathVariable int customerId, @RequestBody CustomerUpdateRequest customerUpdateRequest) {
		return this.customerService.updateCustomer(customerId, customerUpdateRequest);
	}

}

