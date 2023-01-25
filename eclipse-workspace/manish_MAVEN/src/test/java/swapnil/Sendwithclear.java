package swapnil;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendwithclear {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg");
		
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		
		
		String a=driver.findElement(By.name("firstname")).getAttribute("value");
		Actions act=new Actions(driver);
		
		for(int i=a.length();i>=3;i--) {
			
		
		
		act.sendKeys(Keys.BACK_SPACE).build().perform();
		
		System.out.println("clear");
		
		}
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File scrshot=ts.getScreenshotAs(OutputType.FILE);
		
		File f=new File("C:\\Users\\LENOVO\\Desktop\\p.png");
		
		FileUtils.copyFile(scrshot, f);
		
		
		

	}

}
