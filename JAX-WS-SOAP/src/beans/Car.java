package beans;

import java.io.Serializable;

public class Car implements Serializable {

	private static final long serialVersionUID = -1L;

	private int id;
	private String model;
	private int ageOfCar;

	public String getName() {
		return model;
	}

	public void setName(String name) {
		this.model = name;
	}

	public int getAge() {
		return ageOfCar;
	}

	public void setAge(int age) {
		this.ageOfCar = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return id + "::" + model + "::" + ageOfCar;
	}

}