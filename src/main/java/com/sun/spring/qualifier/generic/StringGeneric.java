package com.sun.spring.qualifier.generic;


public class StringGeneric implements MyGeneric<String> {

	public String getToString(String t) {
		return t.toString();
	}

	
}
