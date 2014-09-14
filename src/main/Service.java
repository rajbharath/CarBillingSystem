package main;

/*
 * responsibilities
 * - creating new service
 * - get charge
 * - discountrate
 * - getdiscounted rate
 * - getServicedCustomerName
 * - getServicedCar
 * */

public class Service {
	Customer customer;
	Car car;

	public Service(Car car, Customer customer) {
		this.customer = customer;
		this.car = car;
	}

	public double getCharge() {
		return car.getServiceCharge();
	}

	public double getDiscountedCharge() {
		return getCharge() - getCharge() * (getDiscount() / 100);
	}

	public double getDiscount() {
		return customer.getDiscount();
	}

	public String getServicedCar() {
		return car.toString();
	}

	public String getServiceCustomerName() {
		return customer.getName();
	}

}
