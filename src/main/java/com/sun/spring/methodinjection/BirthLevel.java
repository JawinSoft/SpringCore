package com.sun.spring.methodinjection;

public enum BirthLevel {

	UB("Upper Birth"), MB("Middle Birth"), LB("Lower Birth"), SL("Side Lower"), SU("Side Upper");

	private String birthName;

	BirthLevel(String birthName) {
		this.birthName = birthName;
	}

	public String getBirthName() {
		return birthName;
	}
}
