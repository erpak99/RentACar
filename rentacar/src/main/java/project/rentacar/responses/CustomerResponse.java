package project.rentacar.responses;

import project.rentacar.entities.Customer;

public class CustomerResponse {

	private int customerId;
	private String firstName;
	private String lastName;
	private int age;	
	private String licenseType;

	public CustomerResponse(Customer entity) {
		this.customerId = entity.getCustomerId();
		this.firstName = entity.getFirstName();
		this.lastName = entity.getLastName();
		this.age = entity.getAge();
		this.licenseType = entity.getLicenseType();
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLicenseType() {
		return licenseType;
	}

	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}
	
}
