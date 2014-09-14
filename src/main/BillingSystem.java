package main;
/*
 * responsibilities
 * - generating the BIll for a service 
 * */
public class BillingSystem {

	private Service service;

	public void generateBill(Service service) {
		IOUtil.println("CAR SERVICE CENTER");
		IOUtil.println("Customer name :" + service.getServiceCustomerName());
		IOUtil.println("Car Type : " + service.getServicedCar());
		IOUtil.println("Charge :" + service.getCharge());
		IOUtil.println("Discount Percentage :" +service.getDiscount());
		IOUtil.println("Discounted Charge :" + service.getDiscountedCharge());
	}
}
