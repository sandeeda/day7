package day7;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class Question1Test {

	@Test
	void testFileExist() {

	File file=new File("C:\\Users\\sandeeda\\Documents\\file handling");
	assertEquals(true, file.exists());
	file=new File("C:\\Users\\sandeeda\\Documents\\file handling not present");
	assertEquals(false, file.exists());
	
	
	}

}
