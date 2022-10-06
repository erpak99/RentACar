package project.rentacar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.rentacar.entities.Brand;
import project.rentacar.services.BrandService;

@RestController
@RequestMapping("/brands")
public class BrandsController {

	private BrandService brandService;
	
	@Autowired
	public BrandsController(BrandService brandService) {
		this.brandService = brandService;
	}
	
	@PostMapping("/create")
	public Brand createBrand(@RequestBody Brand brand) {
		return this.brandService.createBrand(brand);
	}
	
	@GetMapping("/getall")
	public List<Brand> getAllBrands() {
		return this.brandService.getAllBrands();
	}
	
	@GetMapping("/getbyid/{brandId}")
	public Brand getBrandById(@PathVariable int brandId) {
		return this.brandService.getBrandById(brandId);
	}
}
