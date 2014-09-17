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

	private double getCharge() {
		return car.getServiceCharge();
	}

	private double getDiscountedCharge() {
		return getCharge() - getCharge() * (getDiscount() / 100);
	}

	private double getDiscount() {
		return customer.getDiscount();
	}

	private String getServicedCar() {
		return car.toString();
	}

	private String getServiceCustomerName() {
		return customer.getName();
	}

	private String getServicedCarNumber() {
		return car.getNumber();
	}

	public String getInfo() {
		String service = "";
		
		service += "Customer name :" + customer.getName() + "\n";
		service += "Car Number : " + car.getNumber() + "\n";
		service += "Car Specifications : " + car + "\n";
		service += "Charge :" + getCharge() + "\n";
		service += "Discount Percentage :" + getDiscount() + "\n";
		service += "Discounted Charge :" + getDiscountedCharge() + "\n";
		return service;
	}

}
