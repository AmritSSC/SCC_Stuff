/*
 * Amrit Dahal
 * CSC142: Final Project
 * Seattle Central College Sp2019
 * 
 * SnapShopConfiguration.java
 * 
 * This project takes an image and implements different types of filters on it.
*/

 // Write your short report here (-2 if there is no report)
/*
 Report:
 		  First, I would like to acknowledge and thank the tutoring and assistance provided to me to complete this assignment.
 		It took a few tries to understand how to manipulate the rgb bytes that were read by data[row][col].
		Calling methods to execute a command is still a weak point of mine.		
		  Image manipulations other than the ones stated on the project requirements are not included in this project.
		Overall, this project was good in tying up all the things we learned over the course of this class: creating methods, using arrays,
		mathematical manipulations... It was also a good project to help understand coordinating multi-file projects.
			
		  After accidently deleting then restoring Filter.java from the project folder, Eclipse was no longer happy with the project,
		  it keeps throwing an error:  
		  		"Error: A JNI error has occurred, please check your installation and try again."
		  However, running it on  jGrasp seems to be fine, and the project executes there.
		  
*/




/**
 * A class to configure the SnapShop application
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SnapShopConfiguration
{
  /**
   * Method to configure the SnapShop.  Call methods like addFilter
   * and setDefaultFilename here.
   * @param theShop A pointer to the application
   */
  public static void configure(SnapShop theShop)
  {

    theShop.setDefaultFilename("\\\\S-C-FS00\\SChomes\\U982027238\\Documents\\CSC142\\ITC142_FINAL\\src/seattle.jpg");
    theShop.addFilter(new FlipHorizontalFilter(), "Flip Horizontal");
    
   //	add your other filters below
   
    theShop.addFilter(new FlipVerticalFilter(), "Flip Vertical");
    theShop.addFilter(new NegativeFilter(), "Negative");
    theShop.addFilter(new GaussianFilter(), "Gaussian");
    theShop.addFilter(new LaplacianFilter(), "Laplacian");
    theShop.addFilter(new UnsharpMaskingFilter(), "Unsharp Masking");
    theShop.addFilter(new EdgyFilter(), "Unsharp Masking");

  }
}
