package com.sun.spring.primary;

import org.springframework.beans.factory.annotation.Autowired;

public class JobPrefer {

	@Autowired
	private JOB job;

	public JOB getJob() {
		return job;
	}

	public void setJob(JOB job) {
		this.job = job;
	}
	
	
}
