package manish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/*1) check displayed status for username text box
  2) check enabled status for username text box
3) Enter the value in username text box
4) check displayed status for password text box
5) check enabled status for password text box
6) Enter the value in password text box
7) check displayed status for login button
8) check enabled status for login button
9) click on login button
10) capture the title and add verification point using if else condition */
public class Aas {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe"); 

	       WebDriver driver=new ChromeDriver();
	       
	      driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");  
	      
	      WebElement a=driver.findElement(By.id("txtUsername"));
	      boolean x=a.isDisplayed();
	      System.out.println("display admin ok"+x);
	      
	     boolean y= a.isEnabled();
	     System.out.println("enabled admin ok"+y);
	     
	     a.sendKeys("Admin");
	     String z=a.getAttribute("name");
	     System.out.println("admin getting value "+z);
	     
	     WebElement p=driver.findElement(By.id("txtPassword"));
	     
	     boolean q=p.isDisplayed();
	     System.out.println("display pass ok "+q);
	     
	     boolean r= p.isEnabled();
	     System.out.println("enabled pass  "+r);
	     
	    p.sendKeys("admin123");
	    String e=p.getAttribute("value");
	    System.out.println(e);
	    
	   WebElement abcd= driver.findElement(By.className("button"));
	  boolean f= abcd.isDisplayed();
	   System.out.println("button is display "+f);
	   
	   abcd.isEnabled();
	   boolean g= abcd.isEnabled();
	   System.out.println("button is enabled "+g);
	   
	   abcd.click();
	   
	   String strUrl=driver.getCurrentUrl();
	   Thread.sleep(2000);
	   if (strUrl.contains("dashboard")) 
	   {
		   System.out.println("test case is pass");
	   }
	   else {
		   System.out.println("test case is fail");
	   }
	   
	
	  driver.close();
	   
	       
	}

}
