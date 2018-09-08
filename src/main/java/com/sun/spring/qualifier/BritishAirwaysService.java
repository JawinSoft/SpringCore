package com.sun.spring.qualifier;

import org.springframework.stereotype.Component;

@Component
public class BritishAirwaysService implements AirwaysService{

	public String welcomeMsg(){
		return "Welcome to British Airways...!";
	}
}
