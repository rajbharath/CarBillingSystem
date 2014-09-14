package main;

/*
 * responsibilities
 * - holding decorated car 
 * */
public abstract class Specfication implements Car {
	protected Car car;

	public Specfication(Car car) {
		this.car = car;
	}

}
