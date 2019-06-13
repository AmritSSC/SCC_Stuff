/*
 * Filter that unsharps edges.
 */
public class UnsharpMaskingFilter implements Filter {

	public void filter(PixelImage pi) {
//		double[][] weights = { { -1.0, -2.0, -1.0 }, 
//		                       { -2.0, 28.0, -2.0 }, 
//		                       { -1.0, -2.0, -1.0 } }; // divide by 16 problem again
// instead of divide by 16 in method in PixelImage use 1/16 multiplier here
		double[][] weights = { { -0.0625, -0.125, -0.0625 }, 
				               { -0.125,   1.75 , -0.125  }, 
				               { -0.0625, -0.125, -0.0625 } };
		double scaleFactor = 1.0;

		pi.applyWeightedAverage(weights, scaleFactor);

	}

}
