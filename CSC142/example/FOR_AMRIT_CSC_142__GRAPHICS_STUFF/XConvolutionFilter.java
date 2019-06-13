/*
 * Filter that does mean 2D X-Direction Convolution Filter.
 */
public class XConvolutionFilter implements Filter {

	public void filter(PixelImage pi) {
		double[][] weights = { { -1.0,  0.0,  1.0 }, 
				               { -2.0,  0.0,  2.0 }, 
				               { -1.0,  0.0,  1.0 } };
		double scaleFactor = 1.0;

		pi.applyWeightedAverage(weights, scaleFactor);

	}

}
