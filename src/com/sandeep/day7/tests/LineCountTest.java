package com.sandeep.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.sandeep.day7.LineCount;

class LineCountTest {

	@Test
	void testLineCount() {
		
	
	assertEquals(2, LineCount.count("C:\\filehandling\\fileHandling.txt.txt"));
	
	}

}
