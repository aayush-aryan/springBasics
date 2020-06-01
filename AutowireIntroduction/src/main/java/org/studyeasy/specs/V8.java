package org.studyeasy.specs;

import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Engine;
@Component
public class V8 implements Engine {

	@Override
	public String type() {
		return "V8 engine";
	}

}
