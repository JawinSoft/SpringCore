package com.sun.spring.dependson;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn(value="gotoSchoolEvent")
public class GoToJobEvent {

	public GoToJobEvent() {
		System.out.println(" Executing GoToJobEvent ..!");
	}
}
