package com.sun.spring.primary;

public class PrivateJob implements JOB{

	@Override
	public String jobSafety() {
		return "PrivateJob.. No Job Safety";
	}

}
