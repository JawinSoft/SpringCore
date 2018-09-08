package com.sun.spring.qualifier.generic;


public class IntGeneric implements MyGeneric<Integer> {

	@Override
	public String getToString(Integer t) {
		return t.toString();
	}

}
