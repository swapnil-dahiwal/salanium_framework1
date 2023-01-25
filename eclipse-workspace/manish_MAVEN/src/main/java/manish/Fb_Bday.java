package manish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb_Bday {

	public static void main(String[] args) throws InterruptedException 
	{
		
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
    
   driver.get("https://www.facebook.com/reg");
   driver.manage().window().maximize();
   
    WebElement days= driver.findElement(By.id("day")); 
    Select sel=new Select(days);
    
    sel.selectByVisibleText("25");
    
    WebElement fsd=sel.getFirstSelectedOption();
      String dday=fsd.getText();
    
    
    if (dday.contains("25"))
    {
    	System.out.println(dday+"   PASS---your  selected date 25");
    }
    else {
    	System.out.println(dday+"   FAIL---your wrong date selected plz check...");
    }
     
    WebElement MNT= driver.findElement(By.id("month"));
    
    Select sel2=new Select(MNT);
    
    sel2.selectByIndex(7);
    
    WebElement fsm=sel2.getFirstSelectedOption();
    
     String ok=fsm.getText();
     
     if (ok.contains("Aug"))
     {
     	System.out.println(ok+"   PASS---your  selected manths AUG");
     }
     else {
     	System.out.println(ok+"    FAIL---your wrong date selected plz check...");
     }
      
     
    WebElement years= driver.findElement(By.id("year"));
    
    Select sel3=new Select(years);
    
    sel3.selectByVisibleText("1994");
    WebElement abc=sel3.getFirstSelectedOption();
    String bdayyear=abc.getText();
    
    if (bdayyear.contains("1994"))
    {
    	System.out.println(bdayyear+"  PASS----your seleced year 1994");
    }
    else {
    	System.out.println(bdayyear+"   FAIL-----your selected wrong year plz check....");
    }
    
    Thread.sleep(3000);
    driver.quit();
          
    
    
    
    
    	 
  
   
   
   
   
   
   
   
   
   
    
   
   
   
   
   
   
   
		
	}

}
