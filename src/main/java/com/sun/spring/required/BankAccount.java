package com.sun.spring.required;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Sunilkumar
 *
 */
@Component
public class BankAccount {

	private String aadharNumber;

	public String getAadharNumber() {
		return aadharNumber;
	}

	
	/**
	 * @Required :  Makes Aadhar Number mandatory  for BankAccount
	 * The Value should populated at configuration time.
	 * The value population should happen via explicit property value in a bean definition or through autowiring. 
	 * 
	 */
	@Required
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	
}
