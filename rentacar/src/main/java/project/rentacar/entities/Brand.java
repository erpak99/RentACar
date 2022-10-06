package project.rentacar.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "brands")
public class Brand {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "brand_id")
	private int brandId;
	
	@Column(name = "brand_name")
	private String brandName;
	
	@Column(name = "license_type")
	private String licenseType;
	
	public Brand() {
		super();
	}

	public Brand(int brandId, String brandName, String licenseType) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
		this.licenseType = licenseType;
	}
	
	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getLicenseType() {
		return licenseType;
	}

	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}

}
