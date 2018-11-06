package com.sun.spring.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class JavaConfig {

	@Bean(initMethod="init",destroyMethod="destroyByXml")
	public LifeCycleByInterface lifeCycleByAnnotation(){
		return new LifeCycleByInterface();
	}
}
