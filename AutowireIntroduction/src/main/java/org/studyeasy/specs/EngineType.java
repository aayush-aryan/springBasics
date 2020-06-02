package org.studyeasy.specs;

import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Engine;
@Component("engineType")
public class EngineType implements Engine {
     
	private String type;
	
	
	public EngineType() {
	   type = "unkown";
	}


	public EngineType(String type) {
		this.type = type;
	}


	@Override
	public String type() {
		return type;
	}

}
