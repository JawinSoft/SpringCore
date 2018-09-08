package com.sun.spring.methodinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Solution3 {
	
	
	@Bean 
	@Scope("prototype")
	public Printer printer(){
		return new Printer();
	}
	
	@Bean
	public TrainReservation trainReservation(){
		return new TrainReservation(){
			 public Printer getPrinter() {
		            return printer();
		        }
		};
	}
	

}
