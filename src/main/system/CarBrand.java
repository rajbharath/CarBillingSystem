package main.system;

/*
 * responsibilities
 * - holds servicecharge details for each car brand 
 * */
public enum CarBrand implements SpecificationValue {
	BMW(40.0), AUDI(30.0);
	private Double value;

	private CarBrand(Double value) {
		this.value = value;
	}

	@Override
	public double getServiceCharge() {
		return value;
	}

}
