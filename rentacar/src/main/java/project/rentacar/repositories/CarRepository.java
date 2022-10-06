package project.rentacar.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import project.rentacar.entities.Car;
import project.rentacar.entities.dtos.CarDetailDto;

public interface CarRepository extends JpaRepository<Car, Integer> {

	List<Car> findByBrand_BrandName(String brandName);

	List<Car> findByColor_ColorName(String colorName);

	@Query("Select new project.rentacar.entities.dtos.CarDetailDto(c.dailyPrice, b.brandName, co.colorName) From Car c Inner Join c.brand b Inner Join c.color co")
	List<CarDetailDto> getCarDetails();

}
