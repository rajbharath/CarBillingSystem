package main;

/*
 * responsibilities
 * - creating the customer based on the given type
 * */
public class CustomerCreator {

	public static Customer create(int i) {
		IOUtil.println("Enter the Customer name");
		String name = IOUtil.read();
		switch (i) {
		case 1:
			return new Customer(name);
		case 2:
			return new SilverCustomer(name);
		case 3:
			return new GoldCustomer(name);
		default:
			break;
		}
		return null;
	}

}
