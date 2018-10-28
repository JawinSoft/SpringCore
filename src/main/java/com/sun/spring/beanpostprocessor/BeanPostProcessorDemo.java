package com.sun.spring.beanpostprocessor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemo implements BeanPostProcessor {
 
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("inside postProcessBeforeInitialization ");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("inside postProcessAfterInitialization ");
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
	
	@PostConstruct
	public void init() throws Exception {
		System.out.println("Executing init method");
	}

	
}
