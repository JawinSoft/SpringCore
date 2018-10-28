package com.sun.spring.instantiation;

public class StatiFactoryDemo {
	
	private static StatiFactoryDemo ms = new StatiFactoryDemo();
	
	// private zero arg constructor ...
	// It's not possible to create object for this class 
	private StatiFactoryDemo(){
		System.out.println("Executing Zero Arg MySingleton class");
	};

	//Call below method to create Object for MySingleton class
	public static StatiFactoryDemo createStatiFactoryDemo(){
		return ms;
	}
	
	
	
	
	
	
	
	
	public MyInstanceClass createMyInstanceClass(){
		MyInstanceClass mc = new MyInstanceClass();
		// Will do extra Configuration on MyInstanceClass
		mc.init();
		return mc;
	}
}
