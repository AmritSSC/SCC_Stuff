/*
   CS142: Assignment 5 Greiger Counter
   Amrit Dahal
   Seattle Central College Sp 2019
   
   The following code reads an csv file with radiation measurement, determines 
   the max radiation count per minute (ct/min) value and returns all radiation
   values within 5ct/min of the max value.
   
   
   Assignment question answer:
   
   The most likely date of the described camping trip is:
                 6/2/2018
   as there are three measurements in the high end or radiation count,
   which is more than any other day.
   Note: While trying to run this project on Eclipse, it keeps requesting user
         to select Ant to run, however fails when selected. 
         It works fine on jGrasp though. The issue has not been determined.
*/

import java.io.*;
import java.util.*;	

public class ITC142_Assignment5 {
    // read file name to be read
    private static String infile = "7_04_18.csv";
			
    public static void main(String[] args) throws Exception{
	  try {
//scan in file to be analyzed, separate lines in it
   		Scanner sc = new Scanner(new File(infile));         					
   		String lineSeparator = System.getProperty("line.separator");
   		sc.useDelimiter(lineSeparator);
         
// find number of lines in file:
         BufferedReader reader = new BufferedReader(new FileReader(infile));
         int numberOfLines = 0;
         while (reader.readLine() != null) 
            numberOfLines++; // number of lines in file
         reader.close();
   
// end code to determine number of lines in file    
 
 
 //make ArrayList to store values of interest:
   		ArrayList<Integer> radValue = new ArrayList<>();
         ArrayList<String> radDate = new ArrayList<>();					 
   
// go through file to get data of interest:
   		for (int i = 0; i < numberOfLines; i++) {
   		    
// read currently relevent line: 			
   		    String line = sc.next();    
             String[] columns = line.split(",");
             
// create a value with only radiation data
             if ( (columns.length == 3) && (i > 1) ){
// obtain radiation and convert to int to store:
               Integer result = Integer.valueOf(columns[2]);	
               radValue.add(result);
// obtain date and time value indexed the same:
               radDate.add(columns[0]);
             }//end if
   		 }// end for
//close file as all relevent data on hand now          
    		 sc.close();
//get max Radiation value:
          int maxRad = Collections.max(radValue);
//show number of datapoints, max Radiation value, and table description and column names
          System.out.println("\nNumber of DataPoints: " + radDate.size());
          System.out.println("Max Value= " + maxRad + "\n");
          System.out.println("Measurements within 5 ct/min of max value:\n");
          System.out.println("#   Date and Time       Ct/min");
             

//go through every data point and see if it is within 5 ct/min of max value
          int j = 0; // index value
          for (int i = 0; i < radValue.size(); i++)
          {
// print value and corresponding dates for filtered Radiation count values:          
               if ( (maxRad - radValue.get(i)) < 5){
                 j++; 
                 System.out.println(j + ".  " + radDate.get(i) + "        " + radValue.get(i));
               }//end if
          }//end for

                 

	   } catch (IOException e) {            
			e.printStackTrace();
	   }
     }
}

