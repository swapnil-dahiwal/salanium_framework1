package swapnil;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice {

	public static void main(String[] args) {
		System.setProperty("webdriver,chrome,driver","C:\\Users\\LENOVO\\eclipse-workspace\\manish\\\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
          driver.get("https://www.facebook.com/reg");
		
		WebElement wb =driver.findElement(By.id("month"));
		
		Select sel= new Select(wb);
 
		
        List<WebElement> wbb=sel.getOptions();
        
        for (WebElement abc:wbb) 
        {
        	String xyz=abc.getText();
        	System.out.println(xyz);
        	
        }
			   
			   
		
			}

	}


