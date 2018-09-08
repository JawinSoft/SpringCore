package com.sun.spring.circular;

public class ServiceProvider {
 
	private PaymentProcesser pp;

	public PaymentProcesser getPp() {
		return pp;
	}

	public void setPp(PaymentProcesser pp) {
		this.pp = pp;
	}
	
	//Case 2
	public ServiceProvider(PaymentProcesser pp){
	   this.pp = pp;
	}
}
