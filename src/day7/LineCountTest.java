package day7;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class LineCountTest {

	@Test
	void testLineCount() {
		
		int count=0;
	File file=new File("C:\\filehandling\\fileHandling.txt.txt");
	try(FileReader fileReader=new FileReader(file);
			BufferedReader reader=new BufferedReader(fileReader);)	
	{
/*		String s=null;
*/		while((reader.readLine())!=null)
		{
			count++;
		}
	} 
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	assertEquals(2, count);
	
	}

}
