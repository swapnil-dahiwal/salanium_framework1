package swapnil;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pim_act_Enter_data {

	public static void main(String[] args) {


		System.setProperty("webdriver.driver.chromedriver", "C:\\\\Users\\\\LENOVO\\\\eclipse-workspace\\\\manish\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		WebElement wb=driver.findElement(By.id("txtUsername"));
		Actions act=new Actions (driver);
		act.sendKeys(wb, "Admin").sendKeys(Keys.TAB, "admin123").sendKeys(Keys.ENTER).build().perform();		
	
	   driver.findElement(By.xpath("//b[text()='PIM']"));
	}

}
