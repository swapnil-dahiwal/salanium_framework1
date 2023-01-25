package manish;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPage {

	public static void main(String[] args) {
	
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe");
 
  
  WebDriver driver = new ChromeDriver();
  
  driver.get("https://www.google.com");
  
  driver.getTitle();
  String abc=driver.getTitle();
  System.out.println(abc);
  

  
  String a= driver.getCurrentUrl();
   System.out.println(a);
  
  
  
 
  
  
  
  
  
  
	
  
	}

}
