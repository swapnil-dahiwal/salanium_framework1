package manish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrmpim_pim_table {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.className("button")).click();
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		
	}
	
}
