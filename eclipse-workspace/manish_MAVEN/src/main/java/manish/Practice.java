package manish;




import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Practice {

	public static void main(String[] args) throws IOException  {
		
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe");
		 
		  
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.facebook.com/org");
		  
		  TakesScreenshot ts= (TakesScreenshot) driver;
		  
		   File f= ts.getScreenshotAs(OutputType.FILE);
		   
		   FileUtils.copyFile(f,new File("C:\\\\Users\\\\LENOVO\\\\Desktop\\\\abc.png"));
		     
		 System.out.println("sshot done");
	       	       
		       //C:\\Users\\LENOVO\\Desktop\\abc.png
		       

	}

}
