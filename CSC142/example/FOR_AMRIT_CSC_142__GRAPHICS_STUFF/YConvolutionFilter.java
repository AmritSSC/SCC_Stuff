/*
 * Filter that does mean 2D Y-Direction Convolution Filter.
 */
public class YConvolutionFilter implements Filter {

	public void filter(PixelImage pi) {
		double[][] weights = { { -1.0, -2.0, -1.0 }, 
				               {  0.0,  0.0,  0.0 }, 
				               {  1.0,  2.0,  1.0 } };
		double scaleFactor = 1.0;

		pi.applyWeightedAverage(weights, scaleFactor);

	}

}
