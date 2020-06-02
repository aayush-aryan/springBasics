package org.studyeasy.cars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Car;
import org.studyeasy.interfaces.Engine;

@Component("myCorolla")
public class Corolla implements Car {
  @Autowired
  @Qualifier("engineType") // we are injecting engintype object in engine class
  Engine engine;
		

@Override
 public String speces() {
 String speces = "Sudan from toyta with engine type as  :" + engine.type();
	return speces;
	}

}
