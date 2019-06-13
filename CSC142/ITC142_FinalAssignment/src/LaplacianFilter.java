/*
 * Amrit Dahal
 * CSC142: Final Project
 * Seattle Central College Sp2019
 * 
 * LaplacianFilter.java
 * 
 * Creates Laplacian filter
*/
public class LaplacianFilter implements Filter
{
   public void filter(PixelImage pi)
	  {
	    //Matrix for Laplacian filter 
		int[][] mat = {{-1,-1,-1},{-1,8,-1},{-1,-1,-1}};
		
	    pi.getAverages(mat, 0);
	  }	  
}