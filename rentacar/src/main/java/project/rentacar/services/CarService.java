package project.rentacar.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.rentacar.entities.Brand;
import project.rentacar.entities.Car;
import project.rentacar.entities.Color;
import project.rentacar.entities.dtos.CarDetailDto;
import project.rentacar.repositories.CarRepository;
import project.rentacar.requests.CarCreateRequest;
import project.rentacar.requests.CarUpdateRequest;

@Service
public class CarService {

	private CarRepository carRepository;
	private BrandService brandService;
	private ColorService colorService;
	
	@Autowired
	public CarService(CarRepository carRepository, BrandService brandService, ColorService colorService) {
		this.carRepository = carRepository;
		this.brandService = brandService;
		this.colorService = colorService;
	}
	
	public Car saveCar(CarCreateRequest newCarRequest) {
		Brand brand = brandService.getBrandById(newCarRequest.getBrandId());
		Color color = colorService.getColorById(newCarRequest.getColorId());
		if (color != null && brand != null) {
			Car newCar = new Car();
			newCar.setCarId(newCarRequest.getCarId());
			newCar.setModelYear(newCarRequest.getModelYear());
			newCar.setDailyPrice(newCarRequest.getDailyPrice());
			newCar.setDescription(newCarRequest.getDescription());
			newCar.setBrand(brand);
			newCar.setColor(color);
			if(newCarRequest.getDailyPrice()<=0) {
				return null;
			}
			return this.carRepository.save(newCar);
		} else
			return null;
	}

	public List<Car> getAllCars() {
		return this.carRepository.findAll();
	}

	public Car updateCar(int carId, CarUpdateRequest carUpdateRequest) {
		Optional<Car> car = carRepository.findById(carId);
		if(car.isPresent()) {
			Car updatedCar = car.get();
			updatedCar.setDailyPrice(carUpdateRequest.getDailyPrice());
			updatedCar.setDescription(carUpdateRequest.getDescription());
			this.carRepository.save(updatedCar);
			return updatedCar;
		}
		return null;
	}

	public Car getCarById(int carId) {
		return this.carRepository.findById(carId).orElse(null);
	}

	public List<Car> findByBrand_BrandName(String brandName) {
		return this.carRepository.findByBrand_BrandName(brandName);
	}

	public List<Car> findByColor_ColorName(String colorName) {
		return this.carRepository.findByColor_ColorName(colorName);
	}

	public List<CarDetailDto> getCarDetails() {
		return this.carRepository.getCarDetails();
	}

}
