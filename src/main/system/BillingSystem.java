package main.system;

/*
 * responsibilities
 * - generating the Bill for the given Car and Customer
 * */

public class BillingSystem {
	private String ServiceCenterName;
	private String cashierName;

	public BillingSystem(String serviceCenterName, String cashierName) {
		this.ServiceCenterName = serviceCenterName;
		this.cashierName = cashierName;
	}

	private double getDiscountedCharge(Double serviceCharge, Double discount) {
		return serviceCharge - serviceCharge * (discount / 100);
	}

	public void generateBill(Car car, Customer customer) {
		String billingInfo = "";
		billingInfo += ServiceCenterName + "\n";
		billingInfo += "Customer name :" + customer.getName() + "\n";
		billingInfo += "Car Number : " + car.getNumber() + "\n";
		billingInfo += "Car Specifications : " + car + "\n";
		billingInfo += "Charge :" + car.getServiceCharge() + "\n";
		billingInfo += "Discount Percentage :" + customer.getDiscount() + "\n";
		billingInfo += "Discounted Charge :"
				+ getDiscountedCharge(car.getServiceCharge(),
						customer.getDiscount()) + "\n";
		billingInfo += "Billed By " + cashierName + "\n";
		IOUtil.println(billingInfo);
	}

}
