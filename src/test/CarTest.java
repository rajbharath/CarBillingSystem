package test;

import static org.junit.Assert.assertEquals;
import main.BMW;
import main.Car;
import main.DieselCar;

import org.junit.Before;
import org.junit.Test;

public class CarTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void serviceCharge() {
		Car car = new DieselCar();
		BMW bmw = new BMW(car);
		assertEquals(90.0, bmw.getServiceCharge(), 0.1);
	}

}
