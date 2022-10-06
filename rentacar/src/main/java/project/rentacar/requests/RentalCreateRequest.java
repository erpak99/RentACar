package project.rentacar.requests;

import java.util.Date;

public class RentalCreateRequest {

	private int rentalId;
	private int carId;
	private int customerId;
	private Date rentDate;
	private Date returnDate;
	
	public RentalCreateRequest() {
		super();
	}

	public RentalCreateRequest(int rentalId, int carId, int customerId, Date rentDate, Date returnDate) {
		super();
		this.rentalId = rentalId;
		this.carId = carId;
		this.customerId = customerId;
		this.rentDate = rentDate;
		this.returnDate = returnDate;
	}

	public int getRentalId() {
		return rentalId;
	}


	public void setRentalId(int rentalId) {
		this.rentalId = rentalId;
	}


	public int getCarId() {
		return carId;
	}


	public void setCarId(int carId) {
		this.carId = carId;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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
