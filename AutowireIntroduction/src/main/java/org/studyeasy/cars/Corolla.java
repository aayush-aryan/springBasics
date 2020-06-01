
package org.studyeasy.cars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Car;
import org.studyeasy.interfaces.Engine;

@Component("myCorolla")
public class Corolla implements Car {
	
 //Engine engine = new Engine();
	//@Autowired(required = false)  //this "required flag use whenever object may be required and it might not be required;
	
	@Autowired
	@Qualifier("v6Engine")
	Engine engine;
		
 // @Autowired used in constructor
/*     @Autowired()
   public Corolla(Engine engine) {
    	 engine.type= "new V8 engine";
	this.engine = engine;
}

       @Autowired
	   public void setEngine(Engine engine) {
		 engine.type= "new V8 engine";
		this.engine = engine;
	}

*/
	@Override
	public String speces() {
	 String speces = "Sudan from toyta with engine type as  :" + engine.type();
		return speces;
	}

}
