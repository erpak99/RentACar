package project.rentacar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import project.rentacar.entities.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer>{

}
