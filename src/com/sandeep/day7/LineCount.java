package com.sandeep.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LineCount {

	
	public static int count(String path) {
		int counter=0;
		File file=new File("C:\\filehandling\\fileHandling.txt.txt");
		try(FileReader fileReader=new FileReader(file);
				BufferedReader reader=new BufferedReader(fileReader);)	
		{
	/*		String s=null;
	*/		while((reader.readLine())!=null)
			{
				counter++;
			}
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return counter;
	}
}
