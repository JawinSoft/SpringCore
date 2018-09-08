package com.sun.spring.instantiation;


/**
 * 
 * @author Sunilkumar
 * Never Create Object for this Directly
 * Delegate the responsibility to MySingleton class using MySingleton.createMyInstanceClass()
 * 
 * @see MySingleton.class 
 */
public class MyInstanceClass {
	
	public MyInstanceClass() {
		System.out.println(" Executing zero Arg MyInstanceClass");
	}
	
	public void run(){
		//business logic code
	}

	public void init() {
		// configuration required for farther processing 	
	}

}
