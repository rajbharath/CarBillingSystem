package main;

import java.util.HashMap;
import java.util.stream.Collectors;

public class Specifications extends HashMap<SpecificationName, SpecificationValue>{
	
	public double getTotalServiceCharge() {
		return values().stream().mapToDouble(e -> e.getServiceCharge()).sum();
	}

	public String getFullSpecificationsName() {
		return values().stream().map(e -> e.toString()).collect(Collectors.joining(","));
	}
}
