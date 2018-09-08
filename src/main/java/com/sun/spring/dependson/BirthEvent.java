package com.sun.spring.dependson;

import org.springframework.stereotype.Component;

@Component
public class BirthEvent {

	public BirthEvent() {
		System.out.println(" Executing BirthEvent ..! Welcome to Earth");
	}
}
