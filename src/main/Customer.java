package main;

/*
 * responsibilities
 * - holds customer details such as name , discount
 * */
public class Customer {
	String name;

	public Customer(String name) {
		this.name = name;
	}

	public Double getDiscount() {
		return 0.0;
	}

	public String getName() {
		return name;
	};

}
