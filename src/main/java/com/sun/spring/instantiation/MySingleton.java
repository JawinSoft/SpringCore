package com.sun.spring.instantiation;

public class MySingleton {
	
	private static MySingleton ms = new MySingleton();
	
	// private zero arg constructor ...
	// It's not possible to create object for this class 
	private MySingleton(){
		System.out.println("Executing Zero Arg MySingleton class");
	};

	//Call below method to create Object for MySingleton class
	public static MySingleton createMySingleton(){
		return ms;
	}
	
	
	
	
	
	
	
	
	public MyInstanceClass createMyInstanceClass(){
		MyInstanceClass mc = new MyInstanceClass();
		// Will do extra Configuration on MyInstanceClass
		mc.init();
		return mc;
	}
}
