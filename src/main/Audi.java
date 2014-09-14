package main;
/*
 * responsibilities
 * - name for AUDI Brand
 * - holds its service charge 
 * */
public class Audi extends Specfication {

	public Audi(Car car) {
		super(car);
	}

	@Override
	public double getServiceCharge() {
		return 60.0 + car.getServiceCharge();
	}

	@Override
	public String toString() {
		return "AUDI " + car.toString();
	}

}
