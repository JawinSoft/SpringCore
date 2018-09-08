package com.sun.spring.qualifier.generic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean
	public MyGeneric<String> MyStringGeneric(){
		return new StringGeneric();
	}
	
	@Bean
	public MyGeneric<Integer> MyIntGeneric(){
		return new IntGeneric();
	}
	
	@Bean 
	public A a(){
		return new A();
	}
	
	@Bean 
	public B b(){
		return new B();
	}
}
