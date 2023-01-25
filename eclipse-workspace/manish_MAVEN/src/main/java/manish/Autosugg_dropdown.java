package manish;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosugg_dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		
		WebElement baseFrom=driver.findElement(By.xpath("//input[@id='fromCity']"));
		
	baseFrom.click();
		
		WebElement from=driver.findElement(By.xpath("//input[@placeholder='From']"));
		
	//	WebDriverWait wait=Web
		
		from.sendKeys("PUNE");
		Thread.sleep(1500);
		
		from.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		from.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		//String str=from.getText();
		System.out.println(baseFrom.getText());
		
      /*    if(from.getText().contains("PUNE"))
          {
        	  System.out.println("test case pass");
          }
          else {
        	  System.out.println("fail");
         } */
	}

}
