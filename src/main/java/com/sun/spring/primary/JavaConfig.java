package com.sun.spring.primary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class JavaConfig {

	@Bean
	@Primary
	public JOB govtJob(){
		return new GovtJob();
	}
	
	@Bean
	public JOB privateJob(){
		return new PrivateJob();
	}
	
	@Bean
	public JobPrefer jobPrefer(){
		return new JobPrefer();
	}
}
