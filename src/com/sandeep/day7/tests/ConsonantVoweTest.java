package com.sandeep.day7.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

import com.sandeep.day7.ConsonantVowel;

class ConsonantVoweTest {
	HashSet<Integer> result= new HashSet<>();
	@Test
	void testConsonantVowelCount() {
		
		ConsonantVowel.ConsonantVowelCount("C:\\filehandling\\vowelcon.txt");
		try (FileInputStream file= new FileInputStream("C:\\filehandling\\vowelcon.ser");
				ObjectInputStream in = new ObjectInputStream(file);){
			result= (HashSet<Integer>) in.readObject();
			
			System.out.println(result);
			String [] count;
			count=result.toString().split(",");/*
			String vowelCount= result.toString().substring(1, 4);
			String ConsonantCount= result.toString().substring(6, 8);
			*/
			assertEquals(true, result.toString().contains(count[0]));
			assertEquals(true, result.toString().contains(count[1]));
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}

