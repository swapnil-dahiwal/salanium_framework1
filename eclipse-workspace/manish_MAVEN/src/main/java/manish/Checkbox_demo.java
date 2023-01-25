package manish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_demo {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe"); 

	       WebDriver driver=new ChromeDriver();
	       
	      driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");  
	      
	      WebElement a=driver.findElement(By.id("txtUsername"));
	      boolean x=a.isDisplayed();
	      System.out.println("display admin ok   "+x);
	      
	     boolean y= a.isEnabled();
	     System.out.println("enabled admin ok   "+y);
	     
	     a.sendKeys("Admin");
	     String z=a.getAttribute("name");
	     System.out.println("admin getting value   "+z);
	     
	     WebElement p=driver.findElement(By.id("txtPassword"));
	     
	     boolean q=p.isDisplayed();
	     System.out.println("display pass ok   "+q);
	     
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
	   
	   driver.findElement(By.id("menu_pim_viewPimModule")).click();
	   
	   driver.findElement(By.id("btnAdd")).click();
	   
	   driver.findElement(By.id("firstName")).sendKeys("Krishnali");
	   
	   Thread.sleep(1000);
	   
	   driver.findElement(By.id("middleName")).sendKeys("Umesh");
	   Thread.sleep(1000);
	   
	   driver.findElement(By.id("lastName")).sendKeys("TAK");
	   Thread.sleep(1000);
	   
	   driver.findElement(By.id("btnSave")).click();
	   
	   driver.quit();
	   

	}

}
