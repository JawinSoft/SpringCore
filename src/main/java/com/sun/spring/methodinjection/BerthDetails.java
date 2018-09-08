package com.sun.spring.methodinjection;

public class BerthDetails {
	
	

	public BerthDetails(String userName, int berthNumber, String coachNumber, BirthLevel birthName) {
		this.userName = userName;
		this.berthNumber = berthNumber;
		this.coachNumber = coachNumber;
		this.birthName = birthName;
	}

	private String userName;
	
	private int berthNumber;
	
	private String coachNumber;
	
	private BirthLevel birthName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	public String getCoachNumber() {
		return coachNumber;
	}

	public void setCoachNumber(String coachNumber) {
		this.coachNumber = coachNumber;
	}

	public BirthLevel getBirthName() {
		return birthName;
	}

	public void setBirthName(BirthLevel birthName) {
		this.birthName = birthName;
	}

	@Override
	public String toString() {
		return "BerthDetails [userName=" + userName + ", berthNumber =" + berthNumber + ", coachNumber=" + coachNumber
				+ ", birthName=" + birthName + "]";
	}
	
}
