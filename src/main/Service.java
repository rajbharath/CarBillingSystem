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

	public String getServicedCarNumber() {
		return car.getNumber();
	}

	@Override
	public String toString() {
		String service = "";
		service += "CAR SERVICE CENTER" + "\n";
		service += "Customer name :" + customer.getName() + "\n";
		service += "Car Number : " + car.getNumber()+ "\n";
		service += "Car Specifications : " + car+ "\n";
		service += "Charge :" + getCharge()+ "\n";
		service += "Discount Percentage :" + getDiscount()+ "\n";
		service += "Discounted Charge :" + getDiscountedCharge()+ "\n";
		return service;
	}

}
