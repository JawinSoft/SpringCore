package com.sun.spring.qualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean
	public USAirwaysPortal usAirwaysPortal(){
		return new USAirwaysPortal();
	}
	
	@Bean
	public BritishAirwaysPortal birtishAirwaysPortal(){
		return new BritishAirwaysPortal();
	}
	
	@Bean
	public BritishAirwaysService briteshAirwaysService(){
		return new BritishAirwaysService();
	}
	
	@Bean
	public USAirwaysService usAirwaysService(){
		return new USAirwaysService();
	}
	
}
