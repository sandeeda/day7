package com.sandeep.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sandeep.day7.RandomNumber1To49;

class RandomNumber1To49Test {

	@Test
	void testRandomGen() {
		assertEquals(null, RandomNumber1To49.randomGen());
	}

}
