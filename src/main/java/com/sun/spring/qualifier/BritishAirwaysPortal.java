package com.sun.spring.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BritishAirwaysPortal {

	@Autowired
	private AirwaysService airwaysService;

	public AirwaysService getAirwaysService() {
		return airwaysService;
	}

	public void setAirwaysService(AirwaysService airwaysService) {
		this.airwaysService = airwaysService;
	}
	
}
