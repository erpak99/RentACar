package project.rentacar.requests;

import java.util.Date;

public class RentalUpdateRequest {

	private Date rentDate;
	private Date returnDate;
	private int carId;
	
	public RentalUpdateRequest() {
		super();
	}

	public RentalUpdateRequest(Date rentDate, Date returnDate, int carId) {
		super();
		this.rentDate = rentDate;
		this.returnDate = returnDate;
		this.carId = carId;
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

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}
	
	
}
