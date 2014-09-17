package main;

/*
 * gets the input and passes to the billing system
 * */
public class Cashier {
	static String name = "Murugan";

	public static void main(String[] args) {
		BillingSystem billingSystem = new BillingSystem();
		Specifications specifications = new Specifications();
		specifications.put(SpecificationName.CARBRAND, CarBrand.AUDI);
		specifications.put(SpecificationName.FUELTYPE, FuelType.DIESEL);
		Car car = new Car("TN57 AA 9544", specifications);
		Customer customer = new Customer("bharath", Badge.GOLD);
		Service service = new Service(car, customer);
		billingSystem.generateBill(service, name);
	}
}
