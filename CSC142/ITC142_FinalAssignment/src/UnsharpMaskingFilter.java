/*
 * Amrit Dahal
 * CSC142: Final Project
 * Seattle Central College Sp2019
 * 
 * Unsharp_MaskingFilter.java
 * 
 * Creates Unsharp_Masking filter
*/
public class UnsharpMaskingFilter implements Filter
{
   public void filter(PixelImage pi)
	  {
	   	//Matrix for Unsharp Masking filter
		int[][] mat = {{-1,-2,-1},{-2,28,-2},{-1,-2,-1}};
	    pi.getAverages(mat, 0);
	  }	  
}
