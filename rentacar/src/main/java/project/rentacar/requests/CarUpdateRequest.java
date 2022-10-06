package project.rentacar.requests;

public class CarUpdateRequest {

	private float dailyPrice;
	private String description;
	
	public CarUpdateRequest() {
		
	}
	
	public CarUpdateRequest(float dailyPrice, String description) {
		super();
		this.dailyPrice = dailyPrice;
		this.description = description;
	}

	public float getDailyPrice() {
		return dailyPrice;
	}

	public void setDailyPrice(float dailyPrice) {
		this.dailyPrice = dailyPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
