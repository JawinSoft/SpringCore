package com.sun.spring.beanfactorypostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanFactoryPostProcessorDemo implements BeanFactoryPostProcessor{

	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition bd = beanFactory.getBeanDefinition("helloWorld");
		System.out.println(bd.getBeanClassName());
		
		MutablePropertyValues props = bd.getPropertyValues();
		props.addPropertyValue("message", "Hello My Dear Friends.. Welcome to Spring BeanFactory Post Processor");
		
		bd.setScope("prototype");
	}
	
	

}
