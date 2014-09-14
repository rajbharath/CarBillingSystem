package main;

/*
 * responsibilities
 * - holds the car specification such as Car Type ,Brand
 * */
public class CarSpec {
	public int getCarType() {
		IOUtil.println("Please enter the Car Type");
		IOUtil.println("Press 1 for Petrol Car");
		IOUtil.println("Press 2 for Diesel Car");
		return IOUtil.readInt();
	}

	public int getCarBrand() {
		IOUtil.println("Enter Car Brand");
		IOUtil.println("Press 1 for BMW");
		IOUtil.println("Press 2 for AUDI");
		return IOUtil.readInt();
	}
}
