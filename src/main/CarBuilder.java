package main;
/*
 * responsibilities
 * - builds a car for given CarSpec
 * */
public class CarBuilder {
	public static Car build(CarSpec carSpec) {
		Car car = null;
		int carType = carSpec.getCarType();
		int carBrand = carSpec.getCarBrand();
		
		switch (carType) {
		case 1:
			car = new PetrolCar();
			break;
		case 2:
			car = new DieselCar();
			break;
		default:
			break;
		}

		switch (carBrand) {
		case 1:
			car = new BMW(car);
			break;
		case 2:
			car = new Audi(car);
			break;
		default:
			break;
		}
		return car;
	}
}
