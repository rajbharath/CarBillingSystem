package main;

/*
 * responsibilities
 * - generating the BIll for a service  
 * */
public class BillingSystem {

	public void generateBill(Service service) {
		IOUtil.println(service.toString());
	}
}
