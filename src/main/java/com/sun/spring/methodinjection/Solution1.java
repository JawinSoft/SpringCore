package com.sun.spring.methodinjection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Solution1 implements ApplicationContextAware{

	private ApplicationContext applicationContext;

	
	/**
	 * Method to Check Seat Availability 
	 * Expecting, For every call a new Seat Avail Instance
	 * @throws Exception 
	 */
	public void processReservation() throws Exception{
		List<Printer> list = new ArrayList<Printer>();
		
		//User 1
		BerthDetails bd = new BerthDetails("Sunil Kumar",10,"S1",BirthLevel.LB);	
		Printer printer = createPrinter();
		printer.setBerthDetails(bd);
		list.add(printer);
				
		 bd = new BerthDetails("Gnana",11,"S1",BirthLevel.MB);	
		 printer = createPrinter();
		printer.setBerthDetails(bd);
		list.add(printer);
				
		 bd = new BerthDetails("Manoj",12,"S1",BirthLevel.UB);	
		 printer = createPrinter();
		printer.setBerthDetails(bd);
		list.add(printer);	
				
		 bd = new BerthDetails("Raghu",15,"S1",BirthLevel.UB);	
		 printer = createPrinter();
		printer.setBerthDetails(bd);
		list.add(printer);
			
		
		ExecutorService executor = Executors.newFixedThreadPool(5);
        executor.invokeAll(list);
        executor.shutdown();
	}
	
	protected Printer createPrinter() {
        // notice the Spring API dependency!
        return this.applicationContext.getBean("printer", Printer.class);
    }
	
	public void setApplicationContext(
            ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
	
}
