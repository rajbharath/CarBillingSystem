package test;

import static org.junit.Assert.*;
import main.system.BillingSystem;
import main.system.Car;
import main.system.Customer;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BillingSystemTest {

	@Mock
	private Car car;
	@Mock
	private Customer customer;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void generateBillTest() {
		when(car.getNumber()).thenReturn("TA 54 BA 9785");
		when(customer.getName()).thenReturn("Ram");
		when(car.toString()).thenReturn("Specification");
		when(car.getServiceCharge()).thenReturn(5000.00).thenReturn(5000.00);
		when(customer.getDiscount()).thenReturn(5.00).thenReturn(5.00);
		
		BillingSystem billingSystem = new BillingSystem("Car Service Center",
				"Saravanan");
		billingSystem.generateBill(car, customer);
	}

}
