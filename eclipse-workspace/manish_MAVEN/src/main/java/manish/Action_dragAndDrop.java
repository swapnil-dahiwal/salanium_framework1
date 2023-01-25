package manish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_dragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	
		 WebElement src=driver.findElement(By.id("box1"));
		 WebElement targt=driver.findElement(By.id("box105"));
		 
		 Actions act=new Actions(driver);
		 act.dragAndDrop(src, targt).build().perform();
		 String a=src.getCssValue("background-color");
		 System.out.println(a);
		 
		 if(a.equals("rgba(255, 255, 255, 1)")) {
			 System.out.println("Test case pass");
		 }
	
		 Thread.sleep(3000);
	     WebElement cap=driver.findElement(By.id("capitals"));
	    
	     act.dragAndDrop(src, cap).build().perform();
	     
		 
		 
	}

}
