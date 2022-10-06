package project.rentacar.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.rentacar.entities.Rental;

public interface RentalRepository extends JpaRepository<Rental, Integer> {

	List<Rental> findByCustomer_CustomerId(int customerId);

}
