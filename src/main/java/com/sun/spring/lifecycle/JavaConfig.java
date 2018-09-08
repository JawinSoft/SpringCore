package com.sun.spring.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean
	public LifeCycleByAnnotation lifeCycleByAnnotation(){
		return new LifeCycleByAnnotation();
	}
}
