package main.system;

/*
 * responsibilities
 * - holds servicecharge details for each fuel type 
 * */
public enum FuelType implements SpecificationValue {
	DIESEL(30, "Diesel"), PETROL(40, "Petrol");
	double value;
	private String name;

	private FuelType(double value, String name) {
		this.value = value;
		this.name = name;
	}

	public double getServiceCharge() {
		return value;
	}

	@Override
	public String toString() {
		return name;
	}

}
