package com.sun.spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springcollections.xml");
		
		CollectionExample collection = context.getBean(CollectionExample.class);
		
		/*System.out.println(collection.getProperty("objectCount"));
		
		List<String> list = collection.getList();
		for(String str:list){
			System.out.println("String :   "+str);
		}
		
		System.out.println(collection.getSomeMap());
		
		System.out.println(collection.getSomeSet());*/
		
		CollectionExample collection1 = context.getBean(CollectionExample.class);
		
		System.out.println(collection);
		System.out.println(collection1);
		
		System.out.println("Am Done ");
		
	}
	
}
