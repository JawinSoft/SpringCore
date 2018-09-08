package com.sun.spring.customeditor;

import java.util.Date;

public class WeddingInvitation {

	private String boyName;
	private String girlName;
	private Date date;
	
	public String getBoyName() {
		return boyName;
	}
	public void setBoyName(String boyName) {
		this.boyName = boyName;
	}
	public String getGirlName() {
		return girlName;
	}
	public void setGirlName(String girlName) {
		this.girlName = girlName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "WeddingInvitation [boyName=" + boyName + ", girlName=" + girlName + ", date=" + date + "]";
	}
	
	
	
}
