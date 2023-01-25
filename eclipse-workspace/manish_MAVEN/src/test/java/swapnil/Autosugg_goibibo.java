package swapnil;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Autosugg_goibibo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/flights/");
		
		driver.findElement(By.xpath("//span[text()='From']")).click();
		
		WebElement wb=driver.findElement(By.xpath("//input[@type='text']"));

		wb.sendKeys("pune");
		Thread.sleep(3000);
		//wb.sendKeys(Keys.ARROW_DOWN);
	   
		wb.sendKeys(Keys.ENTER);
		
	  WebElement wb1=driver.findElement(By.xpath("//input[@type='text']"));
	  
	  wb1.sendKeys("mumbai");
	  Thread.sleep(1000);
	  wb1.sendKeys(Keys.ENTER);
	  
	  driver.findElement(By.xpath("//span[text()='Done']")).click();
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//a[text()='Done']")).click();
	  
	}

}
