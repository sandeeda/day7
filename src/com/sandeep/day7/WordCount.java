package com.sandeep.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

	public static int count(String path) {
		// TODO Auto-generated method stub
		int count=0;
		File file=new File(path);
		try(FileReader filereader=new FileReader(file);
				BufferedReader reader=new BufferedReader(filereader);
						)
		{
			int i;
			String s;
			String [] array;
			
			while((s=reader.readLine())!=null)
			{
				array=s.split("\\s+");
				count+=array.length;
			}
			
	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return count;
		}

}
