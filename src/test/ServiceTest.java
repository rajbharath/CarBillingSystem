package test;

import main.Car;
import main.Customer;
import main.Service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

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
		when(customer.getDiscount()).thenReturn(15.0);
		service.getInfo();
		verify(car, times(3)).getServiceCharge();
		verify(customer, times(1)).getDiscount();
	}

}
