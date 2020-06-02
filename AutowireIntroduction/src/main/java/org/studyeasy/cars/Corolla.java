package org.studyeasy.cars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Car;
import org.studyeasy.interfaces.Engine;

@Component("myCorolla")
public class Corolla implements Car {
/*
 *qualifier use in case of ambugity problem ; @Qualifier annotation give the name of component
 *whch we want to use 
 *error : single matching bean but found two v6 and v8;	
 */
  @Autowired
  @Qualifier("v6Engine") 
  Engine engine;
		

@Override
 public String speces() {
 String speces = "Sudan from toyta with engine type as  :" + engine.type();
	return speces;
	}

}
