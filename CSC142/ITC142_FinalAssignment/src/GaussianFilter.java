/*
 * Amrit Dahal
 * CSC142: Final Project
 * Seattle Central College Sp2019
 * 
 * GaussianFilter.java
 * 
 * Creates Gaussian filter
 * 
 */
public class GaussianFilter implements Filter
{
   public void filter(PixelImage pi)
	  {
	   	//Matrix for Gaussian filter
		int[][] mat = {{1,2,1},{2,4,2},{1,2,1}};
		
	    pi.getAverages(mat, 0);
	  }	  
}
