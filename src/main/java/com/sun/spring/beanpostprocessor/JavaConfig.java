package com.sun.spring.beanpostprocessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public BeanPostProcessorDemo beanPostProcessorDemo(){
		return new BeanPostProcessorDemo();
	}

}
