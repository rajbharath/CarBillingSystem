package main;

/*
 * responsibilities
 * - maintains the contract for a Car
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
