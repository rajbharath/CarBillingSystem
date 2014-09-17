package main;

/*
 * gets the input and passes to the billing system
 * */
public class Cashier {
	static String name = "Murugan";
	private BillingSystem billingSystem;

	public Cashier() {
		billingSystem = new BillingSystem("Number One Car Service Center",
				"Murugan");
	}

	public void generateBill(Car car, Customer customer) {
		billingSystem.generateBill(car, customer);
	}

	public static void main(String[] args) {
		Cashier cashier = new Cashier();

		Specifications specifications = new Specifications();
		specifications.put(SpecificationName.CARBRAND, CarBrand.AUDI);
		specifications.put(SpecificationName.FUELTYPE, FuelType.DIESEL);
		Car car = new Car("TN57 AA 9544", specifications);

		Customer customer = new Customer("bharath", Badge.GOLD);

		cashier.generateBill(car, customer);
	}
}
