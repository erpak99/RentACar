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

import project.rentacar.entities.Car;
import project.rentacar.entities.dtos.CarDetailDto;
import project.rentacar.requests.CarCreateRequest;
import project.rentacar.requests.CarUpdateRequest;
import project.rentacar.services.CarService;

@RestController
@RequestMapping("/cars")
public class CarsController {

	private CarService carService;
	
	@Autowired
	public CarsController(CarService carService) {
		this.carService = carService;
	}
	
	@PostMapping("/save")
	public Car saveCar(@RequestBody CarCreateRequest newCarRequest) {
		return this.carService.saveCar(newCarRequest);
	}
	
	@GetMapping("/getall")
	public List<Car> getAllCars() {
		return this.carService.getAllCars();
	}
	
	@GetMapping("/getbyid/{carId}")
	public Car getCarById(@PathVariable int carId) {
		return this.carService.getCarById(carId);
	}
	
	@PutMapping("/{carId}")
	public Car updateCar(@PathVariable int carId, @RequestBody CarUpdateRequest carUpdateRequest) {
		return this.carService.updateCar(carId, carUpdateRequest);
	}
	
	@GetMapping("/getbybrandname")
	public List<Car> findByBrand_BrandName(@RequestParam String brandName) {
		return this.carService.findByBrand_BrandName(brandName);
	}
	
	@GetMapping("/getbycolorname")
	public List<Car> findByColor_ColorName(@RequestParam String colorName) {
		return this.carService.findByColor_ColorName(colorName);
	}
	
	@GetMapping("/getcardetails")
	public List<CarDetailDto> getCarDetails() {
		return this.carService.getCarDetails();
	}
	
}
