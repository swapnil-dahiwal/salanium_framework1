package manish;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {
static WebDriver driver;

public static void ok( WebElement days, String value)
   {
	   Select sel=new Select (days);
	   List<WebElement> ls =sel.getOptions();
		
		for(WebElement abc: ls)
		{
			System.out.println(abc.getText());
			break;
		}
	 
    }           
	
      public static void main(String[] args) {
    	  
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe");	  
		   driver = new ChromeDriver();	  
		  driver.get("https://www.facebook.com/reg");
		  
		  WebElement days=driver.findElement(By.id("day"));
           
		  Dropdown2.ok(days,"10");
		  
		  WebElement month=driver.findElement(By.id("month"));
          
		  Dropdown2.ok(month,"Aug");
		  
		  WebElement years=driver.findElement(By.id("year"));
          
		  Dropdown2.ok(years,"2008");
	}
        
}
