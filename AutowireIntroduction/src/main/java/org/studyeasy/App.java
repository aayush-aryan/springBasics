package org.studyeasy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.studyeasy.interfaces.Car;

public class App {

	public static void main(String[]args) {
		
	 AnnotationConfigApplicationContext context = 
			 new AnnotationConfigApplicationContext(AppConfig.class);
	 
		 Car mycar = context.getBean("myCorolla",Car.class);
		 System.out.println(mycar.speces());
		 context.close();
	 }
}
