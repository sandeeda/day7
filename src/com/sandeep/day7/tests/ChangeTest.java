package com.sandeep.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.sandeep.day7.DateFormatCheck;

class ChangeTest {

	ArrayList<String> dates=new ArrayList<>();
	@Test
	void testFormatChange() {
		DateFormatCheck.dateCheck("25061996");
		try(FileInputStream file=new FileInputStream("C:\\filehandling\\dates.ser");
				ObjectInputStream out=new ObjectInputStream(file);)
		{
			dates= (ArrayList<String>) out.readObject();
			
			
			
			assertEquals("25/06/1996", dates.get(0));
			assertEquals("25 June 1996", dates.get(1));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
