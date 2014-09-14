package main;

/*
 * responsibilities
 * - holds the details of petrol car such as name and service charge
 * */
public class PetrolCar implements Car {
	private Double serviceCharge = 50.0;

	@Override
	public double getServiceCharge() {
		return serviceCharge;
	}

	@Override
	public String toString() {
		return "Petrol Car";
	}

}
