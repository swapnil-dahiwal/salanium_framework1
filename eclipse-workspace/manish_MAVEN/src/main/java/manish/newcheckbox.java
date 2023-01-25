package manish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newcheckbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe"); 

	       WebDriver driver=new ChromeDriver();
	       
	       driver.get("https://prafpawar11.github.io/checkbox.html");
	       
	      WebElement wb= driver.findElement(By.name("API Testing"));
	      
	      System.out.println(wb.isDisplayed());
	      
	      System.out.println(wb.isEnabled());
	      
	      System.out.println(wb.isSelected());
	      
	      wb.click();
	      
	      driver.findElement(By.name("Automation Testing"));
	      
	      System.out.println(wb.isDisplayed());
	      
	}

}
