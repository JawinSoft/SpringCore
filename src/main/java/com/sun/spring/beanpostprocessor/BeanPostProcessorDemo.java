package com.sun.spring.beanpostprocessor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemo implements BeanPostProcessor {
 
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("inside postProcessBeforeInitialization ");
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("inside postProcessAfterInitialization ");
		return bean;
	}
	
	
}
