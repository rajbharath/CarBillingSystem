package main;
/*
 * responsibilities
 * - holding discount of a gold customer
 * */
public class GoldCustomer extends Customer {

	public GoldCustomer(String name) {
		super(name);
	}

	@Override
	public Double getDiscount() {
		return 30.0;
	}

}
