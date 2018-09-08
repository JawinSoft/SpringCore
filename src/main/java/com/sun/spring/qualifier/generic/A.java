package com.sun.spring.qualifier.generic;

import org.springframework.beans.factory.annotation.Autowired;

public class A {

	@Autowired
	private MyGeneric<String> stringArg;

	public MyGeneric<String> getStringArg() {
		return stringArg;
	}

	public void setStringArg(MyGeneric<String> stringArg) {
		this.stringArg = stringArg;
	}
	
}
