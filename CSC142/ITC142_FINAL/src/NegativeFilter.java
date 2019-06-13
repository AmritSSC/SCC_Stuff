import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class NegativeFilter implements Filter
{
  public void filter(PixelImage pi)
  {
    Pixel[][] data = pi.getData();
    
    for (int row = 0; row < pi.getHeight(); row++)
    {
      for (int col = 0; col < pi.getWidth(); col++)
      {
        Pixel temp = data[row][col];
//read the values in the pixel        
        int red = temp.red;
        int green = temp.green;
        int blue = temp.blue;
 
//update values in pixel        
        red = 255 - red;
        green = 255 - green;
        blue = 255 - blue;

// update values in temp        
        temp.red = red;
        temp.green = green;
        temp.blue = blue;
 
//enter value back into data         
        data[row][col] = temp;
        
        ;
      }
    }

    pi.setData(data);
  }
}