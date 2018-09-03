package com.sandeep.day7.tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sandeep.day7.DayDateMontYear;

class DayDateMontYearTest {

	@Test
	void testDDMY() {
		assertEquals("Tue, 25 June 1996" , DayDateMontYear.DDMY("25/06/1996"));
	}

}
