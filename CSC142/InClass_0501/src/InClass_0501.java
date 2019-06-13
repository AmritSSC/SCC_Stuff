/*  This is probably the simplest Person class definition that we could write. A Person is
 *  completely described by the single String, fullName.
 *   
 *   The main() method is used to test all methods in the Person class.  If you add a method to 
 *   the class definition, add tests for that method in main().
*/ 
public class Person {

	private String fullName;
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String name) {
		fullName = name;
	}
	
/*
 *  If you add or modify methods, make sure to add tests for them below:
*/
	public static void main(String[] args) {

		 Person person = new Person();
		 
		 person.setFullName("Tuco Benedicto Pacifico Juan Maria Ramirez");  // a long name
		 
		 System.out.println("Long name test: " + person.getFullName());
		 
		 person.setFullName("");                               // an empty String
		 
		 System.out.println("Empty name test: " + person.getFullName());
		 System.out.println("Tests completed successfully.");
		 
	}

}
