package Test_layer;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;
import Utilil_Layer.ImageComparisonUtility;
import Utilil_Layer.TestBrowser;


public class ImageComparison extends BaseClass {

	
	
	public static void main(String[] args) throws Exception {
		
		TestBrowser.openChromeDriver();
      
        driver.get("https://demo.guru99.com/test/guru99home/");

        // Find the element and take a screenshot

        WebElement logoElement = driver.findElement(By.xpath("//div[@class='rt-logo-block']//img[1]"));

        ImageComparisonUtility.compareImages(logoElement, "D://sql sample//logo.png");

	}

}
