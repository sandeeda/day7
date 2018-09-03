package com.sandeep.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class BinaryIO {

	public static Object binaryRandomWrite() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		File file=new File("C:\\filehandling\\CreateData.dat");
		
		
		try(FileWriter filewriter=new FileWriter(file);
				PrintWriter writer=new PrintWriter(filewriter);) {
			for(int i=0;i<100;i++)
			{
				int  n = rand.nextInt(500) + 1;
				String str="";
				str=str+Integer.toBinaryString(n);
				writer.print(str);
				writer.println();
			}
		} 
		
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



/////////////////////////////////code for app to read data/////////////////////////////////////////////////////////////////////

		try(FileReader filereader = new FileReader("C:\\filehandling\\CreateData.dat");
				BufferedReader reader= new BufferedReader(filereader);) {
			ArrayList<Integer> boyNumer=new ArrayList<>();
			String s;
			while((s=reader.readLine())!=null)
			{
				int temp;
				temp=Integer.parseInt(s,2);
				boyNumer.add(temp);
			}
			
			System.out.println(boyNumer);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
		

		return null;
	}

}
