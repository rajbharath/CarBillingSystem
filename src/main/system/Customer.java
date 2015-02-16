package main.system;

/*
 * responsibilities
 * - holds customer details such as name, badge
 * */
public class Customer {
	String name;
	protected Double discount = 0.0;
	Badge badge;

	public Customer(String name) {
		this(name, Badge.NORMAL);
	}

	public Customer(String name, Badge badge) {
		this.name = name;
		this.badge = badge;
	}

	public void setBadge(Badge badge) {
		this.badge = badge;
	}

	public Double getDiscount() {
		return badge.getDiscountValue();
	}

	public String getName() {
		return name;
	};

}