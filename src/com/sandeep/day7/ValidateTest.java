package com.sandeep.day7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateTest {

	public static Object validate(String input,int ext) {
		// TODO Auto-generated method stub
		String regex = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);




		if(matcher.matches())
		{
			
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
			try {  
				Date date = formatter.parse(input);
				Calendar c = Calendar.getInstance(); 
				c.setTime(date); 
				c.add(Calendar.DATE, ext);
				date = c.getTime();
				formatter = new SimpleDateFormat("dd MMMM yyyy");  
				String strDate = formatter.format(date);
				
				System.out.println(strDate);
				return strDate;
				
			} catch (ParseException e) {e.printStackTrace();}  
		}
		
		
		return "date is not proper";
		
	}

}
