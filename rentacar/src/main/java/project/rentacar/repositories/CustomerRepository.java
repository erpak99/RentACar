package project.rentacar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import project.rentacar.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
