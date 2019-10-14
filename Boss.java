package demo01.pojo;

public class Boss {

	private String name;
	private String company;
	private String car;
	private String hobby;
	public Boss() {
		super();
	}
	public Boss(String name, String company, String car, String hobby) {
		super();
		this.name = name;
		this.company = company;
		this.car = car;
		this.hobby = hobby;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "Boss [name=" + name + ", company=" + company + ", car=" + car + ", hobby=" + hobby + "]";
	}
	
}
