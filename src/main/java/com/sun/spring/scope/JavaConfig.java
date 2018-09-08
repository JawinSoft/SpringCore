package com.sun.spring.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {

	@Bean
	@Scope("prototype")
	public Company company(){
		return new Company();
	}
}
