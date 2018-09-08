package com.sun.spring.lifecycle;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//InitializingBean,DisposableBean Model
		//interfaceApproach();
		
		//@PostConstruct , @PreDestroy
		annotationApproach();
	}

	private static void interfaceApproach(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lifecycle/init-dispos-config.xml");
		LifeCycleByInterface lcbi = context.getBean(LifeCycleByInterface.class);
		System.out.println(lcbi);		
		lcbi = null;
		context.close();
	}
	
	private static void annotationApproach(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		LifeCycleByAnnotation lcbi = context.getBean(LifeCycleByAnnotation.class);
		System.out.println(lcbi);		
		lcbi = null;
		context.close();
	}
}
