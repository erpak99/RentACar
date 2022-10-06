package project.rentacar.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "car_id")
	private int carId;
	
	@Column(name = "model_year")
	private int modelYear;
	
	@Column(name = "daily_price")
	private float dailyPrice;
	
	@Column(name = "description")
	private String description;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "brand_id")
	private Brand brand;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "color_id")
	private Color color;
	
	public Car() {
		super();
	}

	public Car(int carId, int modelYear, float dailyPrice, String description, Brand brand, Color color) {
		super();
		this.carId = carId;
		this.modelYear = modelYear;
		this.dailyPrice = dailyPrice;
		this.description = description;
		this.brand = brand;
		this.color = color;
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

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
}
