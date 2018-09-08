package com.sun.spring.methodinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new AnnotationConfigApplicationContext(Solution3.class);
		
		// Problem 
		TrainReservation tr = context.getBean(TrainReservation.class);
		tr.processReservation();
		
		//ApplicationContextAware 
		//Solution1 solution1 = context.getBean(Solution1.class);
		//solution1.processReservation();
		
		// @Lookup 
		//Solution2 solution2 = context.getBean(Solution2.class);
		//solution2.processReservation();
	}
}
