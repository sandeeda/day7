package com.sandeep.day7;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateFormatCheck {

	public static void dateCheck(String input) {
		// TODO Auto-generated method stub

		int year=0;
		int month=0;
		int day=0;
		int inputInInteger=0;
		String format1="";
		String format2="";
		String result="";
		ArrayList<String> dates =new ArrayList<>();
		if(input.length()==8)
		{
			inputInInteger=Integer.parseInt(input);
			year=inputInInteger%10000;
			inputInInteger/=10000;
			month=inputInInteger%100;
			inputInInteger/=100;
			day=inputInInteger%100;
			inputInInteger/=100;
			format1+=input.substring(0, 2)+"/"+input.substring(2, 4)+"/"+input.substring(4,8);
			System.out.println(format1);

			String regex = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(format1);




			if(matcher.matches())
			{
				result=result+format1;
				dates.add(result);
				SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
				try {  
					Date date = formatter.parse(format1);
					formatter = new SimpleDateFormat("dd MMMM yyyy");  
					String strDate = formatter.format(date);
					dates.add(strDate);
				} catch (ParseException e) {e.printStackTrace();}  
			}
		}
		else {
			dates.add("Wrong Input");
		}

		try(FileOutputStream file=new FileOutputStream("C:\\filehandling\\dates.ser");
				ObjectOutputStream out=new ObjectOutputStream(file);)
		{
			out.writeObject(dates);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
