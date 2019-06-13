import java.util.Random;

/*
 * Filter that sharpens edges using random weights.
 */


public class RandomEdgyFilter implements Filter {
	


	public void filter(PixelImage pi) {
		
		Random rand = new Random();
		
		//4 is the maximum and the 1 is our minimum.
		int randomNum1 = rand.nextInt(4) + 1;
		int randomNum2 = rand.nextInt(4) + 1;
		
		double Factor1 = (double) randomNum1;
		double FactorC = (double) randomNum2;
	
		
		double[][] weights = { { -1.0 * Factor1, -1.0 * Factor1, -1.0 * Factor1 }, 
				               { -1.0 * Factor1,  9.0 * FactorC, -1.0 * Factor1 }, 
				               { -1.0 * Factor1, -1.0 * Factor1, -1.0 * Factor1 } };
		double scaleFactor = 1.0;

		pi.applyWeightedAverage(weights, scaleFactor);

	}

}
