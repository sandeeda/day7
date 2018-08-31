package com.sandeep.day7.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class GrepTest {

	@Test
	void testGrep()
	{
		assertEquals(true, grep("lorem"));
	}
	
	boolean grep(String sub) {
		File file=new File("C:\\filehandling\\lorem ipsum.txt");
		int count=0;
		try(FileReader filereader = new FileReader(file);
				BufferedReader reader = new BufferedReader(filereader))
		{
			
			
			String s = null;
			while((s=reader.readLine())!=null)
			{
				if(s.toLowerCase().contains(sub.toLowerCase()))
				{
					count++;
					System.out.println(s);
					System.out.println("the substring is present in line number "+count);
					return true;
				}
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}

}
