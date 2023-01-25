package swapnil;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Act_drag_loop {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
			
		 Actions act=new Actions(driver);
		 
		 for(int i=1;i<=7;i++) 
		 {
		WebElement src=driver.findElement(By.id("box"+i));
		
		WebElement target=driver.findElement(By.id("box10"+i));
		
		act.dragAndDrop(src, target).build().perform();
		
		//Thread.sleep(4000);
		WebDriverWait emplicitliwaits=new WebDriverWait(driver,Duration.ofSeconds(5));
	emplicitliwaits.until(ExpectedConditions.visibilityOfElementLocated(By.id(null)));
		 }
		 
		 for (int i = 1; i <= 7; i++) {
				
				
				WebElement src = driver.findElement(By.id("box"+i));
				
				WebElement cap =driver.findElement(By.id("capitals"));
				
				act.dragAndDrop(src, cap).build().perform();
				
				
				
			}
		 }

}
