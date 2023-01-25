package Demo2;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {      // in the aaray list concept
	
	public static WebDriver driver;
	
	
	public static void Shot(String Filename) throws IOException {
		
	TakesScreenshot ts =(TakesScreenshot) driver;
		
		File f=ts.getScreenshotAs(OutputType.FILE);
		
		File des=new File(System.getProperty("user.dir")+"\\sccreenshot\\"+Filename+".png");
		
		FileUtils.copyFile(f, des);	
	}
	
	
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://prafpawar11.github.io/multiplewindows.html");
		
		driver.findElement(By.name("fname")).sendKeys("15lpa");
		
		
		driver.findElement(By.xpath("//a[1]")).click();
		
		
	
		Set <String>allwind=driver.getWindowHandles();
		ArrayList<String>s =new ArrayList<String>(allwind);
		
		driver.switchTo().window(s.get(1));
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(4000);
		
		driver.switchTo().window(s.get(0));
		
		driver.findElement(By.name("lname")).sendKeys("dahiwal");
		
	   Windowhandle.Shot("ok");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
 
}



