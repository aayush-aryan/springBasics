package org.studyeasy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.studyeasy.cars.Corolla;
import org.studyeasy.cars.Swift;
import org.studyeasy.interfaces.Car;

public class App {

	public static void main(String[]args) {
		// Car swift = new Swift();
		// Car coralla = new Corolla();
		// System.out.println(swift.speces());
		 //System.out.println(coralla.speces());
		 
		// Car mycar = new Swift();
		// System.out.println(mycar.speces());
		 
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		 Car mycar = context.getBean("myCorolla",Car.class);
				 System.out.println(mycar.speces());
	 }
}
