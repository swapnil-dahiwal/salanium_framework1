package swapnil;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotfb {
 static WebDriver driver;

	
	
	
	public static void main(String[] args) throws IOException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe");
		 
		  
		 driver = new ChromeDriver();
		 
		 driver.get("https://www.google.com");
		
		 
		         TakesScreenshot ts= (TakesScreenshot) driver;
		 
		        File screenshot=ts.getScreenshotAs(OutputType.FILE);
		
		       File f=new File("C:\\Users\\LENOVO\\eclipse-workspace\\HybridFreamwork\\Passscreenshot\\p7.png");
		       
		       FileUtils.copyFile(screenshot, f);
		       
		        
		        
		
	}
}
