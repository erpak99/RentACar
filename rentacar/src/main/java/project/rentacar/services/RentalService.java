package project.rentacar.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.rentacar.entities.Car;
import project.rentacar.entities.Customer;
import project.rentacar.entities.Rental;
import project.rentacar.repositories.RentalRepository;
import project.rentacar.requests.RentalCreateRequest;
import project.rentacar.requests.RentalUpdateRequest;
import project.rentacar.responses.RentalResponse;

@Service
public class RentalService {

	private RentalRepository rentalRepository;
	private CarService carService;
	private CustomerService customerService;
	
	@Autowired
	public RentalService(RentalRepository rentalRepository,CarService carService,
						 CustomerService customerService) {
		this.rentalRepository = rentalRepository;
		this.carService = carService;
		this.customerService = customerService;
	}

	public Rental saveRental(RentalCreateRequest newRentalRequest) {
		Car car = carService.getCarById(newRentalRequest.getCarId());
		Customer customer = customerService.getCustomerById(newRentalRequest.getCustomerId());
		if(car !=null && customer !=null) {
			Rental newRental = new Rental();
			newRental.setRentalId(newRentalRequest.getRentalId());
			newRental.setRentDate(newRentalRequest.getRentDate());
			newRental.setReturnDate(newRentalRequest.getReturnDate());
			newRental.setCar(car);
			newRental.setCustomer(customer);
			return this.rentalRepository.save(newRental);
	} else 
		return null;
}		
	public List<RentalResponse> getAllRentals() {
		List<Rental> rentals;
		rentals = this.rentalRepository.findAll(); 
		return rentals.stream().map(rental ->new RentalResponse(rental)).collect(Collectors.toList());
	}

	public Rental getRentalById(int rentalId) {
		return this.rentalRepository.findById(rentalId).orElse(null);
	}

	public List<Rental> findByCustomer_CustomerId(int customerId) {
		return this.rentalRepository.findByCustomer_CustomerId(customerId);
	}

	public Rental updateRental(int rentalId, RentalUpdateRequest rentalUpdateRequest) {
		Car car = this.carService.getCarById(rentalUpdateRequest.getCarId());
		Optional<Rental> rental = this.rentalRepository.findById(rentalId);
		if(rental.isPresent() && car !=null) {
			Rental updatedRental = rental.get();
			updatedRental.setRentDate(rentalUpdateRequest.getRentDate());
			updatedRental.setReturnDate(rentalUpdateRequest.getReturnDate());
			updatedRental.setCar(car);
			return this.rentalRepository.save(updatedRental);
		} else
			return null;
	}
}
