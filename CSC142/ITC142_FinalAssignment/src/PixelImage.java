/*
 * Amrit Dahal
 * CSC142: Final Project
 * Seattle Central College Sp2019
 * 
 * PixelImage.java
 */

import java.awt.image.*;

/**
 * Provides an interface to a picture as an array of Pixels
 */
public class PixelImage
{
  private BufferedImage myImage;
  private int width;
  private int height;

  /**
   * Map this PixelImage to a real image
   * @param bi The image
   */
  public PixelImage(BufferedImage bi)
  {
    // initialize instance variables
    this.myImage = bi;
    this.width = bi.getWidth();
    this.height = bi.getHeight();
  }

  /**
   * Return the width of the image
   */
  public int getWidth()
  {
    return this.width;
  }

  /**
   * Return the height of the image
   */
  public int getHeight()
  {
    return this.height;
  }

  /**
   * Return the BufferedImage of this PixelImage
   */
  public BufferedImage getImage()
  {
    return this.myImage;
  }

  /**
   * Return the image's pixel data as an array of Pixels.  The
   * first coordinate is the x-coordinate, so the size of the
   * array is [width][height], where width and height are the
   * dimensions of the array
   * @return The array of pixels
   */
  public Pixel[][] getData()
  {
    Raster r = this.myImage.getRaster();
    Pixel[][] data = new Pixel[r.getHeight()][r.getWidth()];
    int[] samples = new int[3];

    for (int row = 0; row < r.getHeight(); row++)
    {
      for (int col = 0; col < r.getWidth(); col++)
      {
        samples = r.getPixel(col, row, samples);
        Pixel newPixel = new Pixel(samples[0], samples[1], samples[2]);
        data[row][col] = newPixel;
      }
    }

    return data;
  }

  /**
   * Set the image's pixel data from an array.  This array matches
   * that returned by getData().  It is an error to pass in an
   * array that does not match the image's dimensions or that
   * has pixels with invalid values (not 0-255)
   * @param data The array to pull from
   */
  public void setData(Pixel[][] data)
  {
    int[] pixelValues = new int[3];     // a temporary array to hold r,g,b values
    WritableRaster wr = this.myImage.getRaster();

    if (data.length != wr.getHeight())
    {
      throw new IllegalArgumentException("Array size does not match");
    }
    else if (data[0].length != wr.getWidth())
    {
      throw new IllegalArgumentException("Array size does not match");
    }

    for (int row = 0; row < wr.getHeight(); row++)
    {
      for (int col = 0; col < wr.getWidth(); col++)
      {
        pixelValues[0] = data[row][col].red;
        pixelValues[1] = data[row][col].green;
        pixelValues[2] = data[row][col].blue;
        wr.setPixel(col, row, pixelValues);
      }
    }
  }

// add a method to compute a new image given weighted averages
  public void getAverages(int[][] a, int offset)
  {
//initialize pixel arrays needed	  
    Pixel[][] data = getData();
    Pixel[][] newData = getData();;
    
// get weight of matrix    
    int weight = matrixWeight(a);
      

    for (int row = 1; row < getHeight()-1; row++)
    {
      for (int col = 1; col < getWidth()-1; col++)
      {

// get all the pixels that must be manipulated    	  
        Pixel p00 = data[row-1][col-1];
        Pixel p01 = data[row-1][col];
        Pixel p03 = data[row-1][col+1];
        
        Pixel p10 = data[row][col-1];        
        Pixel p11 = data[row][col]; // central pixel        
        Pixel p12 = data[row][col+1];
        
        Pixel p20 = data[row+1][col-1];
        Pixel p21 = data[row+1][col];
        Pixel p22 = data[row+1][col+1];
        
//Average the RGB values using the transformation matrix

        int red = ((p00.red*a[0][0] + p01.red*a[0][1] + p03.red*a[0][2] + p10.red*a[1][0] 
        		     + p11.red*a[1][1] + + p12.red*a[1][2] + p20.red*a[2][0] + p21.red*a[2][1] 
        	         + p22.red*a[2][2])/weight)+ offset;
        
        int green = ((p00.green*a[0][0] + p01.green*a[0][1] + p03.green*a[0][2] + p10.green*a[1][0]
        		      + p11.green*a[1][1] + p12.green*a[1][2] + p20.green*a[2][0] + p21.green*a[2][1]
        		      + p22.green*a[2][2])/weight) + offset;
        
        
        int blue = ((p00.blue*a[0][0] + p01.blue*a[0][1] + p03.blue*a[0][2] + p10.blue*a[1][0]
        		     + p11.blue*a[1][1] + p12.blue*a[1][2] + p20.blue*a[2][0] + p21.blue*a[2][1]
        		     + p22.blue*a[2][2])/weight) + offset;      

        
// check that the values fall within range       
        if(red < 0)
        {
        	red = 0;
        }
        if(red > 255)
        {
        	red = 255;
        }
        if(green < 0)
        {
        	green = 0;
        }
        if(green > 255)
        {
        	green = 255;
        }
        if(blue < 0)
        {
        	blue = 0;
        }
        if(blue > 255)
        {
        	blue = 255;
        }
              
        //Store new values in a separate array
        Pixel temp = new Pixel(red, green, blue);
        newData[row][col]= temp; 
      }
    }
    // set the new data into the Pixel array
    setData(newData); 
  }//end getAverages
  
  // get total weight of the transformation matrix
  public int matrixWeight(int[][] a)
  {
	  int weight = 0;
	  	
	    for(int i = 0; i < a[0].length; i++) //array width
	    {
	    	for(int j = 0; j<a.length; j++) //array length
	    	{
	    	   weight += a[i][j];
	    	}
	    }
	    
	    if(weight == 0)
	    {
	    	weight = 1;
	    }
	    
	    return weight;
  }// end getTotalWeight()
 
}// end class
