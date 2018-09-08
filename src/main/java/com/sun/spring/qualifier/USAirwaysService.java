package com.sun.spring.qualifier;

import org.springframework.stereotype.Component;

@Component
public class USAirwaysService implements AirwaysService {

	public String welcomeMsg(){
		return "Welcome to British Airways...!";
	}
}
