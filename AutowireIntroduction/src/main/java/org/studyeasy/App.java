package org.studyeasy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.studyeasy.cars.Corolla;
import org.studyeasy.cars.Swift;
import org.studyeasy.interfaces.Car;

public class App {

	public static void main(String[]args) {
		
	 AnnotationConfigApplicationContext context = 
			 new AnnotationConfigApplicationContext(AppConfig.class);
	 
		 Car mycar = context.getBean("swift",Car.class);
		 System.out.println(mycar.speces());
		 context.close();
	 }
}
