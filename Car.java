package demo01.pojo;

public class Car {

	private String Brand;
	private String color;
	private String displacement;
	public Car() {
		super();
	}
	public Car(String brand, String color, String displacement) {
		super();
		Brand = brand;
		this.color = color;
		this.displacement = displacement;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDisplacement() {
		return displacement;
	}
	public void setDisplacement(String displacement) {
		this.displacement = displacement;
	}
	
}
