package Demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GURU99DROPDOWN {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement wb=driver.findElement(By.name("country"));
		
		
		Select sel=new Select(wb);
		
		System.out.println(sel.getOptions().size());
		
		int a= sel.getOptions().size();
		
		for(int i=0;i<=a;i++)
		{	
		sel.selectByIndex(i);
		 Thread.sleep(2000);
		}
		
		
		
		
		
		
		
		

	}

}
