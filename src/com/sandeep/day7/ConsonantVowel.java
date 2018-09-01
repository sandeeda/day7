package com.sandeep.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.util.HashSet;

public class ConsonantVowel implements Serializable {

	public static void ConsonantVowelCount(String path) {
		// TODO Auto-generated method stub
		int consonantCount=0;
		int vowelCount=0;
		File file = new File(path);
		try(FileReader filereader = new FileReader(file);
		BufferedReader reader = new BufferedReader(filereader);)
		{
			int ch;
			while((ch=reader.read())!=-1)
			{
				if((char)ch =='a' ||(char)ch =='e' ||(char)ch =='i' ||(char)ch =='o' ||(char)ch =='u' ||(char)ch =='A' ||(char)ch =='E' ||(char)ch =='I' ||(char)ch =='O' ||(char)ch =='U' )
				{
					vowelCount++;
				}
				else
				{
					consonantCount++;
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		HashSet<Integer>count = new HashSet<>();
		count.add(vowelCount);
		count.add(consonantCount);
		
		try {
			FileOutputStream file1 = new FileOutputStream("C:\\filehandling\\vowelcon.ser");
			ObjectOutputStream out1 = new ObjectOutputStream(file1);
			out1.writeObject(count);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

	

}
