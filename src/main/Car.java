package main;

/*
 * responsibilities
 * - serviceCharge of a car
 * - number of a car
 * */
public class Car {

	Specifications specifications;
	String number;

	public Car(String number, Specifications specifications) {
		this.specifications = specifications;
		this.number = number;
	}

	public double getServiceCharge() {
		return specifications.getTotalServiceCharge();
	}

	public String toString() {
		return specifications.getFullSpecificationsName();
	}

	public String getNumber() {
		return number;
	}

}
