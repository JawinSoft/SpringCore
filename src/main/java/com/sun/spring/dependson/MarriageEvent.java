package com.sun.spring.dependson;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn(value="goToJobEvent")
public class MarriageEvent {
	
	public MarriageEvent() {
		System.err.println(" Warning ...! Warning...! ");
		System.out.println("Executing MarriageEvent .. May God bless You");
	}
	
}
