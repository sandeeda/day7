package com.sandeep.day7;

import java.io.Serializable;

public class MyDate implements Serializable{

	
	private String date;

	public MyDate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyDate(String date) {
		super();
		this.date = date;
	}

	@Override
	public String toString() {
		return "MyDate [date=" + date + "]";
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	
	
	
	

}
