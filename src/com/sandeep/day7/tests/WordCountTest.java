package com.sandeep.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.sandeep.day7.WordCount;

class WordCountTest {

	@Test
	void testWordCount() {		
		assertEquals(16,WordCount.count("C:\\\\filehandling\\\\lorem ipsum.txt"));
		
	
	}

}
