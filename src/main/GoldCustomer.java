package main;

/*
 * responsibilities
 * - holding discount of a gold customer
 * */
public class GoldCustomer extends Customer {

	public GoldCustomer(String name) {
		super(name);
		discount = 15.0;
	}

}
