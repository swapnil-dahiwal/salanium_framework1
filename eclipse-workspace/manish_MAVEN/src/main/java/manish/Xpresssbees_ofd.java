package manish;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpresssbees_ofd {

	public static void main(String[] args) throws InterruptedException {
		
	     WebDriverManager.chromedriver().setup();	
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("http://lastmileallocationpod-app.xbees.in/#/login");
		 
		 driver.manage().window().maximize();
		 WebElement wb=driver.findElement(By.xpath("//input[@name='username']"));
		  
		 Actions act=new Actions(driver);
		 
		 act.sendKeys(wb, "ext.rscjintur@xpressbees.com").sendKeys(Keys.TAB,"12345678").sendKeys(Keys.ENTER).build().perform();
		 
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[@id='Inbound']")).click();
	
		driver.findElement(By.xpath("//a[@href='#/CreateRunSheet']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='SR']")).click();
		Thread.sleep(1000);
       act.sendKeys(Keys.ARROW_DOWN,"Rohan" ).sendKeys(Keys.ENTER).build().perform();  
       Thread.sleep(1000); 
      WebElement delops=driver.findElement(By.xpath("//div[@class='col-md-6 mt-3']//input[@id='deliveryOption']")); 
      
      delops.sendKeys("Delivery");
       Thread.sleep(1000); 
       delops.sendKeys(Keys.ARROW_DOWN);
       Thread.sleep(1000); 
       delops.sendKeys(Keys.ENTER);
       Thread.sleep(1000); 
       
   driver.findElement(By.xpath("//input[@name='shipmentNo']")).sendKeys("134093255734639");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//a[text()='Allocated Shipment List']")).click();
	 
	 String str=driver.findElement(By.xpath("//div[@role='alert']")).getText();
	 
	 if(str.contains("Shipment Status is Delivered"))
	 {
		 System.out.println("TEST CASE PASS:- ...........");
	 }        
	 else {
		 System.out.println("already in id");
	 }
	 //driver.findElement(By.xpath("//button[text()='Confirm Allocation']")).click();
	      Thread.sleep(5000);
		     driver.quit();  
	}

}
