package manish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class freamex2 {

	public static void main(String[] args) throws InterruptedException {
/*		enter the text in full name
		switch to mobile no frame and enter the value		-- frame index
				- top frame
		switch to address frame and enter the value
				- top frame
		switch to mobile frame and capture the value
				- top frame
		switch to address frame and capture the value
*/	
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://praf002.github.io/");
		 
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("swapnil");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("mob")).sendKeys("9876543210");
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		//sw to add frame 
		
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@id='add']")).sendKeys("pune mh");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		//sw to mob frame
		WebElement f1=driver.findElement(By.xpath("//iframe[@src='Frame1.html']"));
		driver.switchTo().frame(f1);
		String str1=driver.findElement(By.id("mob")).getAttribute("value");
		System.out.println(str1);
		
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		WebElement addframe=driver.findElement(By.xpath("//iframe[@src='frame2.html']"));
		driver.switchTo().frame(addframe);
		
		String str2=driver.findElement(By.id("add")).getAttribute("value");
		
		System.out.println(str2);
		
		
		
		
	
		
		
		
		 
		 
		 
		 
		 
		 
		 
	}

}
