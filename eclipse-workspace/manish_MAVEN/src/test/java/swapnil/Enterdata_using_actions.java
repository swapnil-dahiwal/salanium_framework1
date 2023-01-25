package swapnil;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Enterdata_using_actions {

	public static void main(String[] args) {
		
		//WebManegar.chromeDriver().setup();
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
       //   driver.get("https://www.facebook.com/");
          
  /*        WebElement wb=driver.findElement(By.id("email"));
          
          Actions act=new Actions(driver);
          
          act.sendKeys(wb,"9156341843").sendKeys(Keys.TAB, "Swapnil@12").sendKeys(Keys.ENTER).build().perform();
	
*/
          
		 driver.get("https://www.amazon.com/");
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		
			
	
	
	}

}
