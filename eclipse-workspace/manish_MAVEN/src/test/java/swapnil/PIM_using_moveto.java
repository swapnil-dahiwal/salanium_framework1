package swapnil;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PIM_using_moveto {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		WebElement username=driver.findElement(By.xpath("//input[@name='txtUsername']"));
		
		Actions act=new Actions(driver);
		
		Thread.sleep(2000);
		act.sendKeys(username,"Admin").sendKeys(Keys.TAB, "admin123").sendKeys(Keys.ENTER).build().perform();

		Thread.sleep(2000);

		
		WebElement wb=driver.findElement(By.xpath("//b[text()='PIM']"));
		
       WebElement config=driver.findElement(By.id("menu_pim_Configuration"));
		
		WebElement custom=driver.findElement(By.id("menu_pim_listCustomFields"));
	
		
		act.moveToElement(wb).build().perform();
		
		Thread.sleep(4000);
		
		act.moveToElement(config).build().perform();
		
		Thread.sleep(4000);
		
		act.click(custom).build().perform();

	}

}
