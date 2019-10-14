package demo01.data;

import java.util.ArrayList;

import demo01.pojo.Car;

public class CarList {

	private ArrayList<Car> list = new ArrayList<Car>();

	public CarList() {
		super();
		this.list.add(new Car("红旗01","黑色","01L"));
		this.list.add(new Car("大众01","白色","02L"));
		this.list.add(new Car("奔驰01","蓝色","03L"));
	}

	public CarList(ArrayList<Car> list) {
		super();
		this.list = list;
	}

	public ArrayList<Car> getList() {
		return list;
	}

	public void setList(ArrayList<Car> list) {
		this.list = list;
	}
	
}
