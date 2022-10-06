package project.rentacar.responses;

import java.util.Date;

import project.rentacar.entities.Rental;

public class RentalResponse {

	private int rentalId;
	private String brandName;
	private float dailyPrice;
	private String colorName;
	private String firstName;
	private String lastName;
	private Date rentDate;
	private Date returnDate;
	
	public RentalResponse(Rental entity) {
		this.rentalId = entity.getRentalId();
		this.brandName = entity.getCar().getBrand().getBrandName();
		this.dailyPrice = entity.getCar().getDailyPrice();
		this.colorName = entity.getCar().getColor().getColorName();
		this.firstName = entity.getCustomer().getFirstName();
		this.lastName = entity.getCustomer().getLastName();
		this.rentDate = entity.getRentDate();
		this.returnDate = entity.getReturnDate();
 	}

	public int getRentalId() {
		return rentalId;
	}

	public void setRentalId(int rentalId) {
		this.rentalId = rentalId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public float getDailyPrice() {
		return dailyPrice;
	}

	public void setDailyPrice(float dailyPrice) {
		this.dailyPrice = dailyPrice;
	}

	public String getColorName() {
		return colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
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

	public Date getRentDate() {
		return rentDate;
	}

	public void setRentDate(Date rentDate) {
		this.rentDate = rentDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	
}
