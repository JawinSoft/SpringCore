package com.sun.spring.customeditor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("customeditor/customeditor.xml");
		
		 WeddingInvitation wi=  context.getBean("weddingInvitation",WeddingInvitation.class);
		 System.out.println(wi);
		
	}
}
