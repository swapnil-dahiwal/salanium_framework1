package manish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class oponlink {

	public static void main(String[] args) throws InterruptedException {
              // connect actual brower 
		
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();  
                 // get url facebook 	
		   
		   driver.get("https://www.facebook.com/reg");		
		   	 
                 //find loactor		   		   
		   
		 WebElement newacc= driver.findElement(By.linkText("Already have an account?"));
               //capture the value of link		 
		 
		   String a=newacc.getText();
         //print value of link	   
		   
		   System.out.println(a);
            //click to link		   
		   newacc.click();
		   
           //condition		   
		   
	  String singin=driver.getTitle();
	  
	  if(singin.contains("Log in to Facebook"))
	  {
		  System.out.println("PASS---YOUR ON LOGIN PAGE   ");
	  }
	  else {
		  System.out.println("FAIL---YOUR ON WRONG PAGE GO TO ");
	  }
		  
		   Thread.sleep(500);
		   driver.quit();
				   
	}

}
