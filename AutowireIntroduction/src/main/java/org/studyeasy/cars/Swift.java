package org.studyeasy.cars;

import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Car;
/*
 * if we mark as swift class as @component annotation than Spring will considered Swift class as bean;
 */

@Component("swift")
public class Swift implements Car {

	@Override
	public String speces() {
		return "HatchBack from swift";
	}

}
