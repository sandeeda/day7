package com.sandeep.day7.tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sandeep.day7.ValidateTest;

class ValidateDateTest {

	@Test
	void testValidate() {
		assertEquals("29 June 1996", ValidateTest.validate("25/06/1996",4));
		assertEquals("date is not proper", ValidateTest.validate("25/16/1996",4));
	}

}
