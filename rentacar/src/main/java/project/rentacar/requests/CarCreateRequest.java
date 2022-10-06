package project.rentacar.requests;


public class CarCreateRequest {

	private int carId;
	private int modelYear;
	private float dailyPrice;	
	private String description;	
	private int brandId;
	private int colorId;
	
	public CarCreateRequest() {
		super();
	}

	public CarCreateRequest(int carId, int modelYear, float dailyPrice, String description, int brandId, int colorId) {
		super();
		this.carId = carId;
		this.modelYear = modelYear;
		this.dailyPrice = dailyPrice;
		this.description = description;
		this.brandId = brandId;
		this.colorId = colorId;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
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

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public int getColorId() {
		return colorId;
	}

	public void setColorId(int colorId) {
		this.colorId = colorId;
	}	
	
	
}
