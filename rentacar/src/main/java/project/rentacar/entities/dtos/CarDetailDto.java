package project.rentacar.entities.dtos;

public class CarDetailDto {

	private float dailyPrice;
	private String brandName;
	private String colorName;
	
	public CarDetailDto() {
		super();
	}

	public CarDetailDto(float dailyPrice, String brandName, String colorName) {
		super();
		this.dailyPrice = dailyPrice;
		this.brandName = brandName;
		this.colorName = colorName;
	}

	public float getDailyPrice() {
		return dailyPrice;
	}

	public void setDailyPrice(float dailyPrice) {
		this.dailyPrice = dailyPrice;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getColorName() {
		return colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}
	
	
}
