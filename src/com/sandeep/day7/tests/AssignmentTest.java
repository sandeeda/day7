package com.sandeep.day7.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.sandeep.day7.Assignment;

class AssignmentTest {

	Assignment assign1=new Assignment(new File ("C:\\Users\\sandeeda\\Downloads\\assignments\\day1.txt"),LocalDate.of(2018, 9, 25));
	Assignment assign2=new Assignment(new File ("C:\\Users\\sandeeda\\Downloads\\assignments\\day2.txt"),LocalDate.of(2018, 10, 25));
	Assignment assign3=new Assignment(new File ("C:\\Users\\sandeeda\\Downloads\\assignments\\day3.txt"),LocalDate.of(2018, 11, 25));
	Assignment assign4=new Assignment(new File ("C:\\Users\\sandeeda\\Downloads\\assignments\\day4.txt"),LocalDate.of(2018, 12, 25));
	Assignment assign6=new Assignment(new File ("C:\\Users\\sandeeda\\Downloads\\assignments\\day5.txt"),LocalDate.of(2018, 12, 25));
	Assignment assign5=new Assignment(new File ("C:\\Users\\sandeeda\\Downloads\\assignments\\day6.txt"),LocalDate.of(2018, 12, 28));
	Assignment assign7=new Assignment(new File ("C:\\Users\\sandeeda\\Downloads\\assignments\\day7.docx"),LocalDate.of(2018, 12, 27));

	@Test
	void testAddAssignment() throws IOException {
		Assignment.addAssignment(assign1);
		Assignment.addAssignment(assign2);
		Assignment.addAssignment(assign3);
		Assignment.addAssignment(assign4);
		Assignment.addAssignment(assign5);
		Assignment.addAssignment(assign6);
		Assignment.addAssignment(assign7);
		assertEquals(true, Assignment.removeAssignment(assign1));
		assertEquals(assign2, Assignment.getNearest());

	}

	

}
