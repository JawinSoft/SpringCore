package com.sun.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleByInterface implements InitializingBean,DisposableBean{

	public LifeCycleByInterface() {
		System.out.println("LifeCycleBeanImpl Constructor Execution");
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("Executing afterPropertiesSet method");
	}

	public void destroy() throws Exception {
		System.out.println("Executing destroy method");
	}
	
	protected void finalize() throws Throwable {
		System.out.println("Executing finalize method");
	}

}
