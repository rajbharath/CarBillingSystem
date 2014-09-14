package main;

/*
 * responsibilities
 * - name for BMW Brand
 * - holds its service charge 
 * */
public class BMW extends Specfication {

	public BMW(Car car) {
		super(car);
	}

	@Override
	public double getServiceCharge() {
		return 50 + car.getServiceCharge();
	}

	@Override
	public String toString() {
		return "BMW " + car.toString();
	}
}
