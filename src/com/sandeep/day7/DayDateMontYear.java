package com.sandeep.day7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DayDateMontYear {
	
	public static String DDMY(String dateEntry) {
		// TODO Auto-generated method stub
		String strDate="";
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
		try {  
			Date date = formatter.parse(dateEntry);
			formatter = new SimpleDateFormat("E, dd MMMM yyyy");  
			strDate = formatter.format(date);
		} catch (ParseException e) {e.printStackTrace();}  
		return(strDate);

	}
	
}
