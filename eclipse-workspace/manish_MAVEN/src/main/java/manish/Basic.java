package manish;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// goto to google display current url
// redirected to facebook dislpay title
// jump back  to google

public class Basic {   

	public static void main(String[] args) throws InterruptedException {
	
	
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe"); 

       WebDriver driver=new ChromeDriver();
       
       driver.get("https://www.google.com");
   
     String a=driver.getCurrentUrl();
     String c=driver.getTitle();
     System.out.println("url:"+a);
     System.out.println("title:"+c);
     
      driver.navigate().to("https://www.facebook.com");
      String b=driver.getTitle();
      System.out.println(b);
     
    driver.navigate().back();
    String d=driver.getCurrentUrl();
    System.out.println(d);
     
     
      
      
 
	}

}
