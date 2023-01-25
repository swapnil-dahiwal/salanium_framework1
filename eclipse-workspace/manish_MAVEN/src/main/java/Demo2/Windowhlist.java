package Demo2;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhlist {

	public static WebDriver driver;
		
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://prafpawar11.github.io/multiplewindows.html");
		
		driver.findElement(By.partialLinkText("HRM")).click();  //3
		driver.findElement(By.partialLinkText("Facebook")).click();  //2
		driver.findElement(By.partialLinkText("Google")).click();   //1

		Set<String>all=driver.getWindowHandles();
		ArrayList<String> s= new ArrayList<String>(all);
		
		driver.switchTo().window(s.get(3));
		                                                     // hrm
		System.out.println(driver.getTitle());
		
          driver.switchTo().window(s.get(0));
		                                                    // parent
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(s.get(2));
		                                                  // facebook
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(s.get(1));                // google
		System.out.println(driver.getCurrentUrl());
		  
		
		
		
		
		
		
		
		
	}

}
