package com.sun.spring.autowire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.sun.spring.autowire")
public class JavaConfig {

	//Java Config --> My Favorite Way of doing 
	@Bean
	public MusicDept musicDept3(){
		return new MusicDept();
	}
	
	@Bean
	public Party party(){
		return new Party();
	}
	
	@Bean
	public DecorDept decorDept(){
		return new DecorDept();
	}
	
	@Bean
	public MusicDept musicDept2(){
		return new MusicDept();
	}
	
}
