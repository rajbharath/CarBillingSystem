package main;

import main.system.Badge;
import main.system.BillingSystem;
import main.system.Car;
import main.system.CarBrand;
import main.system.Customer;
import main.system.FuelType;
import main.system.SpecificationName;
import main.system.Specifications;

public class Main {

	public static void main(String[] args) {
		Specifications specifications = new Specifications();
		specifications.put(SpecificationName.CARBRAND, CarBrand.AUDI);
		specifications.put(SpecificationName.FUELTYPE, FuelType.DIESEL);
		Car car = new Car("TN57 AA 9544", specifications);

		Customer customer = new Customer("bharath", Badge.GOLD);
		BillingSystem billingSystem = new BillingSystem(
				"Number One Car Service Center", "Murugan");
		billingSystem.generateBill(car, customer);
	}
}
