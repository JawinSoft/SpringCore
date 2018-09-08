package com.sun.spring.circular;

public class PaymentProcesser {

	private ServiceProvider sp;

	public ServiceProvider getSp() {
		return sp;
	}

	public void setSp(ServiceProvider sp) {
		this.sp = sp;
	}
	
	
	//Case 2
	public PaymentProcesser(ServiceProvider sp){
		this.sp = sp;
	}
	
}
