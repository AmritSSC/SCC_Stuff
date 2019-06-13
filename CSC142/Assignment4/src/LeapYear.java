/*
 * 	Assignment 4
 *	Amrit Dahal
 *	CSC142 Seattle Central CollegeSp2019
 *  05/22/2019
 *	This program: Determines whether a given year is a leap year or not
 */


public class LeapYear {
	
	private int intYear;
	
	// check what year it is
	public int getYear() {
		return intYear;
	}
	// set a year to examine
	public void setYear(int yearinquestion) {
		intYear = yearinquestion;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//set new class
		LeapYear year = new LeapYear();
		//enter year to be checked:
		int testyear = 2400;
		year.setYear(testyear);
		//set value as variable:		
		int checkYear = year.getYear();
		
		// check if conditions for leap year are fulfilled
		//	(divisible by 4 and 100)
		if( (checkYear%400 == 0) || ((checkYear%100 != 0) && (checkYear%4==0)) )
		{// print it's a leap year

					System.out.println(checkYear + " is a leap year");		
		}
		else
		{// print it's NOT a leap year
			System.out.println(checkYear + " is NOT a leap year.");
		}
		
		int selection = 1; 
		switch (selection) {
		    case 0: System.out.println("0");
		    case 1: System.out.println("1");
		    case 2: System.out.println("2");
		    case 3: System.out.println("3");
		        break;
		}


	}
	

}
