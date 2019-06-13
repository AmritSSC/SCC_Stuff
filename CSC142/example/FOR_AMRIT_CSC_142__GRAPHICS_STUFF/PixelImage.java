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
    // initialise instance variables
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
	// applyWeightedAverage
	// add a method to compute a new image given weighted averages
	public void applyWeightedAverage(double[][] weights, double scaleFactor) {
		Pixel[][] data1 = getData(); // grab data image
		Pixel[][] data2 = getData(); // use to send weighted-average-modified
		
		double total = 0.0; // this is the total of weights for dividing weighted sum
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < weights.length; j++) {
				total += weights[i][j];
			}
		}
		
		// just in case the total equals zero, make ONE to avoid divede by 0 fault
		if (total == 0.0) {
			total = 1.0;
		}

		// use start index of +1 vs. 0 
		// use end   index of -1 vs. 0
		// for rows and columns
		// so as onlly get interior pixels for weighted average transforrmations
		for (int i = 1; i < getHeight() - 1; i++) {     // "i" for rows    - Y cooridnates, careful here
			for (int j = 1; j < getWidth() - 1; j++) {  // "j" for columns - X cooridnates, careful her
				// choose the center one as the original point
				// by 3x3, each row or col move 1 pixel in x, y direction

// matrix definitions fpor variable names naming
// ----------------+-------------------+-------------------
// UL = UpperLeft  | UC = UpperCenter  | UR = UpperRight
// ----------------+-------------------+-------------------				
// CL = CenterLeft | CC = CenterCenter | CR = CenterRight
// ----------------+-------------------+-------------------				
// LL = LowerLeft  | LC = LowerCenter  | LR = LowerRight
// ----------------+-------------------+-------------------				
//   CC is the middle pixel... the pixel to change CenterCenter
// ptCC is the middle pixel... the pixel to change				
				
				
// "i" for rows,    y-values  , carefull here
// "j" for columns, x-value   , carefull here
// -----------------------+------------------------+------------------------
// ptUL = [i - 1],[j - 1] | ptUC = [i - 1],[j + 0] | ptUR = [i - 1],[j + 1]
// -----------------------+------------------------+------------------------				
// ptCL = [i + 0],[j - 1] | ptCC = [i + 0],[j + 0] | ptCR = [i + 0],[j + 1]
// -----------------------+------------------------+------------------------				
// ptLL = [i + 1],[j - 1] | ptLC = [i + 1],[j + 0] | ptLR = [i + 1],[j + 1]
// -----------------------+------------------------+------------------------

// almost did "lL" , "lC" , "lR" due to earyly on uniqueness variable name issues
// ptCC is the middle pixel... the pixel to change
				
				// second try
				// main center pixel and neighboring pixel definitins 
				Pixel ptUL = data1[i - 1][j - 1]; // 1st row of matix
				Pixel ptUC = data1[i - 1][j + 0]; // 1st row of matix
				Pixel ptUR = data1[i - 1][j + 1]; // 1st row of matix
				Pixel ptCL = data1[i + 0][j - 1]; // 2nd row of matix
				Pixel ptCC = data1[i + 0][j + 0]; // ptCC is the middle pixel... the pixel to change
				Pixel ptCR = data1[i + 0][j + 1]; // 2nd row of matix
				Pixel ptLL = data1[i + 1][j - 1]; // 3rd row of matix
				Pixel ptLC = data1[i + 1][j + 0]; // 3rd row of matix
				Pixel ptLR = data1[i + 1][j + 1]; // 3rd row of matix
				
				// 2nd try
				// now calaculate the 
				// averages the rgb values of the pixels
				// avgr for red ; avgg for green ; avgb for blue;
				// "i" for rows,    y-values  , carefull here
				// "j" for columns, x-value   , carefull here

// weights [arrays] from *Filter classes
// "double[][] weights"
// "i" for rows,    y-values  , carefull here
// "j" for columns, x-value   , carefull here
//            i   j               i   j               i   j
// ------------------+-------------------+------------------------
// weights = [0],[0] | weights = [0],[1] | weights = [0],[2]
// ------------------+-------------------+------------------------				
// weights = [1],[0] | weights = [1],[1] | weights = [1],[2]
// ------------------+-------------------+------------------------				
// weights = [2],[0] | weights = [2],[1] | weights = [2],[2]
// ------------------+-------------------+------------------------
				
//ptUL.red * weights[0][0] + ptUC.red * weights[0][1] + ptUR.red * weights[0][2] + // 1st matrix row
//ptCL.red * weights[1][0] + ptCC.red * weights[1][1] + ptCR.red * weights[1][2] + // 2nd matrix row
//ptLL.red * weights[2][0] + ptLC.red * weights[2][1] + ptLR.red * weights[2][2]) / total); // 3rd matrix row		
//  instrcutr:  could not prevent long long long wide computer code line here instrcutr
				double avgr = ((ptUL.red   * weights[0][0] + ptUC.red   * weights[0][1] + ptUR.red   * weights[0][2] + // 1st matrix row
						        ptCL.red   * weights[1][0] + ptCC.red   * weights[1][1] + ptCR.red   * weights[1][2] + // 2nd matrix row
						        ptLL.red   * weights[2][0] + ptLC.red   * weights[2][1] + ptLR.red   * weights[2][2]) / total); // 3rd matrix row
																										// then divide by total
				double avgg = ((ptUL.green * weights[0][0] + ptUC.green * weights[0][1] + ptUR.green * weights[0][2] + // 1st matrix row
				                ptCL.green * weights[1][0] + ptCC.green * weights[1][1] + ptCR.green * weights[1][2] + // 2nd matrix row
				                ptLL.green * weights[2][0] + ptLC.green * weights[2][1] + ptLR.green * weights[2][2]) / total); // 3rd matrix row
																								// then divide by total
				double avgb = ((ptUL.blue  * weights[0][0] + ptUC.blue  * weights[0][1] + ptUR.blue  * weights[0][2] + // 1st matrix row
				                ptCL.blue  * weights[1][0] + ptCC.blue  * weights[1][1] + ptCR.blue  * weights[1][2] + // 2nd matrix row
				                ptLL.blue  * weights[2][0] + ptLC.blue  * weights[2][1] + ptLR.blue  * weights[2][2]) / total); // 3rd matrix row
																								// then divide by total
				
				
				
				
				// instructr here is where you go uncomment to test out divide by 16 problem issue 
				//      i experienced
				// avgr = avgr / scaleFactor;
				// avgg = avgg / scaleFactor;
				// avgb = avgb / scaleFactor;
				
				
				
				

				// in case the rgb value negative less than 0 invalid
				if (avgr < 0.0) {
					avgr = 0.0;
				}
				// in case the rgb value greater than 255 make invalid fault
				if (avgr > 255.0) {
					avgr = 255.0;
				}
				
				
				if (avgg < 0.0) {
					avgg = 0.0;
				}
				if (avgg > 255.0) {
					avgg = 255.0;
				}
				
				
				if (avgb < 0.0) {
					avgb = 0.0;
				}
				if (avgb > 255.0) {
					avgb = 255.0;
				}
				
				
				// before apply new values to image
				//must cast double into Pixel image-useable valid int values
				int intAvgR = (int) avgr;
				int intAvgG = (int) avgg;
				int intAvgB = (int) avgb;
				
				// final new PIXEL with weighted-average transform done now
				data2[i][j] = new Pixel(intAvgR, intAvgG, intAvgB);

			}
		}
		// final new IMAGE with weighted-average transform done now
		setData(data2);
	}  
  
  
}
