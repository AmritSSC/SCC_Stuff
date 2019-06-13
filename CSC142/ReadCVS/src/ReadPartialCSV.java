import java.io.*;
import java.util.*;	

/*
 * This code snippet reads the first 50 lines of the file 7_04_18.csv and echoes 
 * them to the console window.
 * 
 * The filename "7_04_18.csv" below is called a 'relative path name'.  You will 
 * need to make the file available to your program by importing it into your 
 * eclipse project or using some other method...
 * 
 * An 'absolute path name' will have the full path to the file, something like 
 * "C:/users/cd/data/7_04_18.csv".  This technique will work, but then I would 
 * need to modify every student's source code to run their programs.
 * 
 * Please use ONLY relative path names for this programming project!
 * 
 * You may want to just duplicate the try-catch block and 'throws Exception' 
 * as I have coded it below.  We will cover this material on Exception Handling
 * later on, when we get to chapter 8.   
 */

public class ReadPartialCSV {
	 	
    private static String infile = "7_04_18.csv";
			
    public static void main(String[] args) throws Exception{
	  try {
		Scanner sc = new Scanner(new File(infile));

      
		
		String lineSeparator = System.getProperty("line.separator");
		sc.useDelimiter(lineSeparator);
								 
		for (int i = 1; i <= 50; i++) {
		     			
		    String line = sc.next();
          String[] columns = line.split(",");
         
		    System.out.println(line);
		     			
		 }
       
		 sc.close();
	   } catch (IOException e) {            
			e.printStackTrace();
	   }
     }
}

