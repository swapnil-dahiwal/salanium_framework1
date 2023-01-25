package Demo2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic {

	public static WebDriver driver; 
	
	public static void main(String[] args) throws InterruptedException {   
	
		
		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.name("q")).sendKeys("iphone 12");
		Thread.sleep(3000);
		List <WebElement>abc=driver.findElements(By.xpath("//li[@class='Y5N33s']"));

	           System.out.println(abc.size());
	       	for (WebElement xyz:abc) {
			
			System.out.println(xyz.getText());
		}
		
		
	}

}
