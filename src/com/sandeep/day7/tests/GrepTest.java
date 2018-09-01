package com.sandeep.day7.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.sandeep.day7.Grep;

class GrepTest {

	@Test
	void testGrep()
	{
		assertEquals(true, Grep.checkGrep("name is"));
	}
	

}
