package com.sun.spring.dependson;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn(value="birthEvent")
public class GotoSchoolEvent {

	public GotoSchoolEvent() {
		System.out.println("Executing GotoSchoolEvent ...!");
	}
}
