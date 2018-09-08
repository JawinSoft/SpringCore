package com.sun.spring.qualifier.generic;

import org.springframework.beans.factory.annotation.Autowired;

public class B {

	@Autowired
	private MyGeneric<Integer> intGeneric;

	public MyGeneric<Integer> getIntGeneric() {
		return intGeneric;
	}

	public void setIntGeneric(MyGeneric<Integer> intGeneric) {
		this.intGeneric = intGeneric;
	}
}
