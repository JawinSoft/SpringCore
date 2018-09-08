package com.sun.spring.methodinjection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//@Component
public class TrainReservation  {

	
	//@Autowired
	private Printer printer;
	
	public Printer getPrinter() {
		return printer;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}


	/**
	 * Method to Check Seat Availability 
	 * Expecting, For every call a new Seat Avail Instance
	 * @throws Exception 
	 */
	public void processReservation() throws Exception{
		    
	List<Printer> list = new ArrayList<Printer>();
		
		//User 1
		BerthDetails bd = new BerthDetails("Sunil Kumar",10,"S1",BirthLevel.LB);	
		Printer printer = getPrinter();
		printer.setBerthDetails(bd);
		list.add(printer);
				
		 bd = new BerthDetails("Gnana",11,"S1",BirthLevel.MB);	
		  printer = getPrinter();
			printer.setBerthDetails(bd);
		list.add(printer);
				
		 bd = new BerthDetails("Manoj",12,"S1",BirthLevel.UB);	
		 printer = getPrinter();
			printer.setBerthDetails(bd);
		list.add(printer);	
				
		 bd = new BerthDetails("Raghu",15,"S1",BirthLevel.UB);	
		 printer = getPrinter();
			printer.setBerthDetails(bd);
		list.add(printer);
			
	
		ExecutorService executor = Executors.newFixedThreadPool(5);
        executor.invokeAll(list);
        executor.shutdown();
	}
	
}
