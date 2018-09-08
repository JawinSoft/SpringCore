package com.sun.spring.qualifier.generic;


public class StringGeneric implements MyGeneric<String> {

	@Override
	public String getToString(String t) {
		return t.toString();
	}

	
}
