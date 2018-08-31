package com.sandeep.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class WordCountTest {

	@Test
	void testWordCount() {
		int count=0;
		File file=new File("C:\\filehandling\\lorem ipsum.txt");
		try(FileReader filereader=new FileReader(file);
				BufferedReader reader=new BufferedReader(filereader))
		{
			int i;
			while((i=reader.read())!=-1)
			{
				char ch=(char)i;
				if(ch==' ')
				{
					count++;
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("no. of words= "+count);
		
		assertEquals(5, count+1);
		
	
	}

}
