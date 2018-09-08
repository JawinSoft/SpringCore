package com.sun.spring.dependency.injection;

public class Controller {
	
	public Controller(Service service) {
		this.service = service;
	}
	
	private Service service;

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}
	
	//Safe Mode
	public Controller(){}

}
