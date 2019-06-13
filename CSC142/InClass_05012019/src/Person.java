/*  This is probably the simplest Person class definition that we could write. A Person is
 *  completely described by the single String, fullName.
 *   
 *   The main() method is used to test all methods in the Person class.  If you add a method to 
 *   the class definition, add tests for that method in main().
*/ 
public class Person {

	private String fullName;
	
	private String firstName;
	private String lastName;
	private int personAge;
	
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstname) {
		firstName = firstname;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastname) {
		lastName = lastname;
	}
	
	public int getAge() {
		return personAge;
	}
	
	public void setAge(int age) {
		personAge = age;
	}
	
/*	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String name) {
		fullName = name;
	}
*/
	
/*
 *  If you add or modify methods, make sure to add tests for them below:
*/
	public static void main(String[] args) {

		 Person person = new Person();
		 
		 
		 person.setFirstName("God");  // a long name
		 person.setLastName("Spawn");  // a long name
		 person.setAge(34);  // a long name

		 System.out.println("First Name: " + person.getFirstName());
		 System.out.println("LastName: " + person.getLastName());
		 System.out.println("Age: " + person.getAge());
		 
		 person.setFirstName("Empty");                        
		 person.setLastName("Location");  
		 person.setAge(1000);                            
		 
		 
		 System.out.println("Data Chage Test: " + person.getFirstName() + " " + person.getLastName() + "is " + person.getAge() + " years old.");
		 
		 System.out.println("Tests completed successfully. Yaba daba doooooo!!!!!!!!");

		 System.out.println(1+2*3+7*2%5);
		 
		 /*		 
		 person.setFullName("Tuco Benedicto Pacifico Juan Maria Ramirez");  // a long name
		 
		 System.out.println("Long name test: " + person.getFullName());
		 
		 person.setFullName("");                               // an empty String
		 
		 
		 System.out.println("Empty name test: " + person.getFullName());
	 
		 System.out.println("Tests completed successfully.");
*/		 
	}

}
