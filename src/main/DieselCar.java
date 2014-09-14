package main;

/*
 * responsibilities
 * - holds the details of diesel car such as name and service charge
 * */
public class DieselCar implements Car {

	private double serviceCharge = 40.0;

	@Override
	public double getServiceCharge() {
		return serviceCharge;
	}

	@Override
	public String toString() {
		return "Diesel Car";
	}

}
