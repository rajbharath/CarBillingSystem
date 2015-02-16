package main.system;

public enum Badge {
	GOLD(15.0), SILVER(9.0), NORMAL(0.0);
	private Double discount;

	private Badge(Double discount) {
		this.discount = discount;
	}

	public Double getDiscountValue() {
		return discount;
	}
}
