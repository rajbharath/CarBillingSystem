package main;

/*
 * responsibilities
 * - holds customer details such as name , discount
 * */
public class Customer {
	String name;
	protected Double discount = 0.0;
	Badge badge;

	public Customer(String name, Badge badge) {
		this.name = name;
		this.badge = badge;
	}

	public Double getDiscount() {
		return badge.getDiscountValue();
	}

	public String getName() {
		return name;
	};

}

enum Badge {
	GOLD(15.0), SILVER(9.0);
	private Double discount;

	private Badge(Double discount) {
		this.discount = discount;
	}

	public Double getDiscountValue() {
		return discount;
	}
}
