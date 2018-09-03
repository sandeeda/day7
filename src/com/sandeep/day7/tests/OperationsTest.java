package com.sandeep.day7.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.sandeep.day7.Operations;

class OperationsTest {

	@Test
	void testOps() {

		assertEquals(true, Operations.ops("C:\\filehandling\\lorem ipsum.txt","null",1));
		assertEquals(true, Operations.ops("C:\\filehandling\\lorem ipsum.txt","C:\\filehandling\\lorem ipsum copy.txt", 2));
		assertEquals(false, Operations.ops("C:\\filehandling\\lorem ipsum.txt","C:\\filehandling\\random1.txt", 2));
		assertEquals(true, Operations.ops("C:\\filehandling\\lorem ipsum.txt","null",3));

	}

}
