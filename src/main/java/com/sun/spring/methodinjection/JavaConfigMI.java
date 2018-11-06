package com.sun.spring.methodinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfigMI {

	@Bean
	public MovieTicketBook movieTicketBook(){
		MovieTicketBook mvb = new MovieTicketBook(){
			     public Seat getSeat(){
			    	 return seat();
			     }
				};
		return mvb;
	}
	
	@Bean
	@Scope("prototype")
	public Seat seat(){
		return new Seat();
	}
}
