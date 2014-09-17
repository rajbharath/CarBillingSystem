package main;

/*
 * gets the input and passes to the billing system
 * */
public class Cashier {

	public static void main(String[] args) {
		BillingSystem billingSystem = new BillingSystem();
		Specifications specifications = new Specifications();
		specifications.put(SpecificationName.CARBRAND, CarBrand.AUDI);
		specifications.put(SpecificationName.FUELTYPE, FuelType.DIESEL);
		Car car = new Car("asdsad", specifications);
		Customer customer = new Customer("bharath", Badge.GOLD);
		Service service = new Service(car, customer);
		billingSystem.generateBill(service);
	}
}
