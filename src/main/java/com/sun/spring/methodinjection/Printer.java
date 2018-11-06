package com.sun.spring.methodinjection;

import java.util.concurrent.Callable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class Printer implements Callable<String>{
	
	private BerthDetails berthDetails;
	
	public BerthDetails getBerthDetails() {
		return berthDetails;
	}

	public void setBerthDetails(BerthDetails berthDetails) {
		this.berthDetails = berthDetails;
	}



	public String call(){
		System.out.println("BerthDetails "+ berthDetails);
		return berthDetails.getUserName();
	}
	
}
