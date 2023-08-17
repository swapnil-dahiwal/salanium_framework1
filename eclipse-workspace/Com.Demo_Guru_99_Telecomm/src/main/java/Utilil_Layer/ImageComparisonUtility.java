package Utilil_Layer;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class ImageComparisonUtility extends BaseClass{
	
	
	// use mvn dependency version   https://mvnrepository.com/artifact/ru.yandex.qatools.ashot/ashot
	
	  public static void compareImages( WebElement element, String expectedImagePath) throws IOException 
	  { 
			Screenshot logoElementScreenshot = new AShot().takeScreenshot(driver, element);

	        // read the image to compare

	        BufferedImage expectedImage = ImageIO.read(new File("D:\\sql sample\\logo.png"));

	        BufferedImage actualImage = logoElementScreenshot.getImage();

	        // Create ImageDiffer object and call method makeDiff()

	        ImageDiffer imgDiff = new ImageDiffer();
	        ImageDiff diff = imgDiff.makeDiff(actualImage, expectedImage);

	        if (diff.hasDiff() == true)
	        {
	            System.out.println("Images are same");

	        }
	        else 
	        {
	            System.out.println("Images are different");
	        }
	    }
	
}
