package com.sun.spring.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		if("USA".equalsIgnoreCase(args[0])){
			processUSRequest(context);
		}else{
			processBritsRequest(context);
		}
	}
	
	private static void processUSRequest(ApplicationContext context){
		USAirwaysPortal usp = context.getBean("usAirwaysPortal",USAirwaysPortal.class);
		System.out.println(usp.getAirwaysService().welcomeMsg());
	}
	
	private static void processBritsRequest(ApplicationContext context){
		BritishAirwaysPortal bas = context.getBean("britishAirwaysPortal",BritishAirwaysPortal.class);
		System.out.println(bas.getAirwaysService().welcomeMsg());
	}

}
