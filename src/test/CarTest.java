package test;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;
import main.system.Car;
import main.system.CarBrand;
import main.system.FuelType;
import main.system.SpecificationName;
import main.system.Specifications;

import org.junit.Before;
import org.junit.Test;

public class CarTest {

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void serviceCharge() {
		Specifications specifications  = new Specifications();
		specifications.put(SpecificationName.CARBRAND, CarBrand.AUDI);
		specifications.put(SpecificationName.FUELTYPE, FuelType.DIESEL);
		Car car = new Car("TN579380", specifications);
		assertEquals(60.0, car.getServiceCharge(), 0.0);
	}

}
