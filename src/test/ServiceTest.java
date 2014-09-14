package test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import main.Car;
import main.Customer;
import main.Service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ServiceTest {

	@Mock
	Car car;
	@Mock
	Customer customer;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void test() {
		Service service = new Service(car, customer);
		when(car.getServiceCharge()).thenReturn(150.0);
		when(customer.getDiscount()).thenReturn(30.0);
		assertEquals(service.getCharge(), 150.0, 0.1);
		assertEquals(service.getDiscountedCharge(), 105.0, 0.1);
		verify(car,times(3)).getServiceCharge();
		verify(customer, times(1)).getDiscount();
	}

}
