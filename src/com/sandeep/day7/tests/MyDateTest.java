package com.sandeep.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.sandeep.day7.MyDate;

class MyDateTest {
	ArrayList<MyDate> dt=new ArrayList<>();
	ArrayList<MyDate> dt1 = new ArrayList<>();
	
	@Test
	void testDate() {


		dt.add(new MyDate("25/06/1996"));
		dt.add(new MyDate("04/06/1996"));
		dt.add(new MyDate("14/03/2001"));
		dt.add(new MyDate("04/08/1996"));


		try {
			FileOutputStream file = new FileOutputStream("C:\\filehandling\\file.ser");
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(dt);
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		try {
			FileInputStream file = new FileInputStream("C:\\filehandling\\file.ser");
			ObjectInputStream in = new ObjectInputStream((file));
			
			
			dt1 = (ArrayList<MyDate>) in.readObject();
			System.out.println(dt1);
			System.out.println(dt);
			assertEquals(true, compareDate(dt, dt1));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
	

	boolean compareDate(ArrayList<MyDate> dt,ArrayList<MyDate> dt1)
	{
		if(dt.toString().equals(dt1.toString()))
		{
			return true;
		}
		return false;
	}
}
