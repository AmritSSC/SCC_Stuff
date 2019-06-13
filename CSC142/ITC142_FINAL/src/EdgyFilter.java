/*
 * Amrit Dahal
 * CSC142: Final Project
 * Seattle Central College Sp2019
 *
 * EdgyFilter.java
 * Creates Edgy filter
*/
public class EdgyFilter implements Filter
{
   public void filter(PixelImage pi)
	  {
	   	// Array for edgy filter	   
		int[][] mat = {{-1,-1,-1},{-1,9,-1},{-1,-1,-1}};
	    
		pi.getAverages(mat, 0);
	  }	  
}
