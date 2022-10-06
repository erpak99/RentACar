package project.rentacar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import project.rentacar.entities.Rental;
import project.rentacar.requests.RentalCreateRequest;
import project.rentacar.requests.RentalUpdateRequest;
import project.rentacar.responses.RentalResponse;
import project.rentacar.services.RentalService;

@RestController
@RequestMapping("/rentals")
public class RentalsController {

	private RentalService rentalService;
	
	@Autowired
	public RentalsController(RentalService rentalService) {
		this.rentalService = rentalService;
	}
	
	@PostMapping("/save")
	public Rental saveRental(@RequestBody RentalCreateRequest newRentalRequest) {
		return this.rentalService.saveRental(newRentalRequest);
	}
	
	@GetMapping("/getall")
	public List<RentalResponse> getAllRentals() {
		return this.rentalService.getAllRentals();
	}
	
	@GetMapping("/getbyid/{rentalId}")
	public Rental getRentalById(@PathVariable int rentalId) {
		return this.rentalService.getRentalById(rentalId);
	}
	
	@GetMapping("/getbycustomerid")
	public List<Rental> findByCustomer_CustomerId(@RequestParam int customerId) {
		return this.rentalService.findByCustomer_CustomerId(customerId);
	}
	
	@PutMapping("/{rentalId}")
	public Rental updateRental(@PathVariable int rentalId, @RequestBody RentalUpdateRequest rentalUpdateRequest) {
		return this.rentalService.updateRental(rentalId, rentalUpdateRequest);
	}
	
}
