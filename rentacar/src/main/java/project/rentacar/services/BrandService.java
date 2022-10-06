package project.rentacar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.rentacar.entities.Brand;
import project.rentacar.repositories.BrandRepository;

@Service
public class BrandService {
	
	private BrandRepository brandRepository;
	
	@Autowired
	public BrandService(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}

	public Brand createBrand(Brand brand) {
		return this.brandRepository.save(brand);
	}

	public List<Brand> getAllBrands() {
		return this.brandRepository.findAll();
	}

	public Brand getBrandById(int brandId) {
		return this.brandRepository.findById(brandId).orElse(null);
	}

}
