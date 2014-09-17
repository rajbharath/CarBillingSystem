package main;

/*
 * responsibilities
 * - generating the Bill for a service  
 * */
public class BillingSystem {
	private String ServiceCenterName = "Number One Car Service Center";

	public void generateBill(Service service, String cashierName) {
		IOUtil.println(ServiceCenterName + "\n");
		IOUtil.println(service.getInfo());
		IOUtil.println("Billed By "+cashierName);

	}
}
