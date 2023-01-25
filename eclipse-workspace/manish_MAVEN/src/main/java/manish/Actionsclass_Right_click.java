package manish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass_Right_click {
	
	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://prafpawar11.github.io/rightclick1.html");
		
		//first left click oprtion 
		
		driver.findElement(By.id("btn")).click();
		Thread.sleep(8000);
		
		// after 8 sec sencod  oprtion 
		WebElement wb=driver.findElement(By.id("btn2"));
		
		Actions act=new Actions(driver);
		
		act.contextClick(wb).build().perform();
		
		String a=driver.findElement(By.id("demo2")).getText();
		if(a.equals("Right click"))
		{System.out.println("test case pass");}
		else
		{System.out.println("test case fail");}
		
		
		
		
	}

}
