package main;

/*
 * responsibilities
 * - holds customer details such as name , discount
 * */
public class Customer {
	String name;
	protected Double discount = 0.0;

	public Customer(String name) {
		this.name = name;
	}

	public Double getDiscount() {
		return discount;
	}

	public String getName() {
		return name;
	};

}
