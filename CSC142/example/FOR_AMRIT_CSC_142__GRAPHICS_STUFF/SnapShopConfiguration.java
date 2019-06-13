// Write your short report here (-2 if there is no report)
// 1.  very frustrating confusion on weighted sums
//     with Guassian as example 
//     did not understand for certain if need to 
//   sum of weights*pixel-r-g-b values  then  divide (or not?) by total of weights from filter?
//		   then could not get bit divide by 16 with Guassian
//		   when used scaleFactor divide by 16 in new methond in PixelImage
//		   with Gaussian,  just got dark picture image
//		   so with internet reseearch did double 1/16 multipliers
//		   see GuassianFilter.java and UnsharpMaskingFilter.java and PixelImage.java 
//		   for instructr to see if he or she can play iwht the whole value weights with divide by 16 or not
//	again very very fruxtrating make me nervous for final grade
//
//
//  2.  for simple coding style, plese use your local C:/ and have folder called "images"
//      and have your test images files like billg.jpg and seattle.jpg 
//      see SnapShopConfiguration.java (this file) for line
//      line "  theShop.setDefaultFilename("c:/images/billg.jpg");  "
//
//
//  3.  liked by playing with multiple button pushes clicks of Gaussian and other
//      weighted averages filters especially comparing UnsharpMarking and Edgy filters
//      whre Unsharp would have billg.jpg dots in upper left corner 
//      Edgy would have lines in upper left corner
//
//
//  4. liked by playing with seattle.jpg with Guassian 2 click, then,
//     Laplacian 2 click, then,
//     Unsharp 2 click, then, 
//     Edgy 2 click, then,
//     Emboss 2 click     then just click bank and forth with Negative button
	
		   

/**
 * A class to configure the SnapShop application
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SnapShopConfiguration {
	/**
	 * Method to configure the SnapShop. Call methods like addFilter and
	 * setDefaultFilename here.
	 * 
	 * @param theShop
	 *            A pointer to the application
	 */
	public static void configure(SnapShop theShop) {

		theShop.setDefaultFilename("c:/images/billg.jpg");
		theShop.addFilter(new FlipHorizontalFilter(), "Flip Horizontal");
		theShop.addFilter(new FlipVerticalFilter(), "Flip Vertical");
		theShop.addFilter(new NegativeFilter(), "Negative Filter");

		theShop.addFilter(new GaussianBlurFilter(), "Gaussian Blur Filter");
		theShop.addFilter(new LaplacianFilter(), "Laplacian Filter");
		theShop.addFilter(new UnsharpMaskingFilter(), "Unsharp Masking Filter");
		theShop.addFilter(new EdgyFilter(), "Edgy Filter");

		
		
		// add your other filters below
		//    extra attempts below NOT SURE IF work due to limited research time
		theShop.addFilter(new EmbossFilter(), "Emboss Filter");
		theShop.addFilter(new MeanFilter(), "Mean Filter");
		theShop.addFilter(new YConvolutionFilter(), "Y-Convolution Filter");
		theShop.addFilter(new XConvolutionFilter(), "X-Convolution Filter");
		
		// experimented tried with random number generated weights not sure if work applicable
		theShop.addFilter(new RandomEdgyFilter(), "Random Edgy Filter");
		theShop.addFilter(new RandomLaplacianFilter(), "Random Laplacian Filter");
		theShop.addFilter(new RandomGaussianBlurFilter(), "Random Gaussian Blur Filter");
		theShop.addFilter(new RandomUnsharpMaskingFilter(), "Random Unsharp Masking Filter");
		
		
		
		
	}
}
