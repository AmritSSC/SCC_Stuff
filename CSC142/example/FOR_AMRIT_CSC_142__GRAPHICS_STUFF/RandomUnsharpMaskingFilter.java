import java.util.Random;

/*
 * Filter that unsharps edges using random weights.
 */
public class RandomUnsharpMaskingFilter implements Filter {

	public void filter(PixelImage pi) {
		
		Random rand = new Random();
		
		//4 is the maximum and the 1 is our minimum.
		int randomNum1 = rand.nextInt(4) + 1;
		int randomNum2 = rand.nextInt(4) + 1;
		int randomNum3 = rand.nextInt(4) + 1;
		
		double Factor1 = (double) randomNum1;
		double Factor2 = (double) randomNum2;
		double FactorC = (double) randomNum2;

		double[][] weights = { { -0.0625 * Factor1, -0.125  * Factor2, -0.0625 * Factor1 }, 
				               { -0.125  * Factor2,   1.75  * FactorC, -0.125  * Factor2  }, 
				               { -0.0625 * Factor1, -0.125  * Factor2, -0.0625 * Factor1 } };
		double scaleFactor = 1.0;

		pi.applyWeightedAverage(weights, scaleFactor);

	}

}
