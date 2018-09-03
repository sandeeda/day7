package com.sandeep.day7.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.sandeep.day7.Operations;

class OperationsTest {

	@Test
	void testOps() {

		assertEquals(true, Operations.ops("C:\\Users\\sandeeda\\Downloads\\assignments\\day7.docx",1));
	}

}
