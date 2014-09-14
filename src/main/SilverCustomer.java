package main;
/*
 * responsibilities
 * - holding discount of a silver customer
 * */
public class SilverCustomer extends Customer {

	public SilverCustomer(String name) {
		super(name);
	}

	@Override
	public Double getDiscount() {
		return 20.0;
	}

}
