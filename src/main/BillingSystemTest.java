package main;

public class BillingSystemTest {
	private Service service;

	public void getCarSpec() {
		Car car = CarBuilder.build(new CarSpec());
		Customer customer = CustomerCreator.create(getCustomerType());
		service = new Service(car, customer);
	}

	public static int getCustomerType() {
		IOUtil.println("Enter Customer");
		IOUtil.println("Press 1 for Normal");
		IOUtil.println("Press 2 for Silver");
		IOUtil.println("Press 3 for Gold");
		return IOUtil.readInt();
	}

	public static void main(String[] args) {

		BillingSystem billingSystem = new BillingSystem();
		Car car = CarBuilder.build(new CarSpec());
		Customer customer = CustomerCreator.create(getCustomerType());
		Service service = new Service(car, customer);
		billingSystem.generateBill(service);
	}
}
