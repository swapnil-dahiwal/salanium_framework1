package manish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass_amazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		WebElement wb=driver.findElement(By.id("nav-link-accountList"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(wb).build().perform();
		
		driver.findElement(By.linkText("Account")).click();
		
		driver.findElement(By.xpath("//h2[contains(text(),'Your Orders')]")).click();
		
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
		
           driver.findElement(By.id("ap_email")).sendKeys("22435366");
		
		driver.findElement(By.id("ap_password")).sendKeys("213555");
		

	}

}
