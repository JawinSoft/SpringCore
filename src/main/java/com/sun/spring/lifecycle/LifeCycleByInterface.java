package com.sun.spring.lifecycle;

import javax.annotation.*;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleByInterface implements DisposableBean, InitializingBean{
	
	//Class Load Execution
	private static  String message = getMessage();

	static{
		System.out.println("Static block");
	}
	
	public static String getMessage(){
		System.out.println("Static varaible initialization");
		return "abc";
	}
	//Class Load Execution
	
	//Object creation 
	private String insMessage = getMyInsMessage();
	
	{
		System.out.println("instance block");
	}
	
	public  String getMyInsMessage(){
		System.out.println("Instance varaible initialization");
		return "abc";
	}
	
	public LifeCycleByInterface() {
		System.out.println("LifeCycleBeanImpl Constructor Execution");
	}
	//Object creation 
	
	
	//Spring initialization call back
	public void init() throws Exception {
		
		System.out.println("Executing init method");
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("Executing afterPropertiesSet() method");
	}
	
	@PostConstruct
	public void postCons(){
		System.out.println();
		System.out.println("Executing Post Constructor method");
	}
	//Spring initialization call back
	
	
	//Spring Destroy call back	
	//XML config Or Java Config
	public void destroyByXml(){
		System.out.println("inside destroy method XML " );
	}
	
	//Implementing Interface
	public void destroy(){
		System.out.println("inside destroy method Interface");
	}
	
	//Annotation
	@PreDestroy
	public void destroyByAnnotation(){
		System.out.println("inside destroy method Annotation");
	}
	//Spring Destroy call back
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}
}
