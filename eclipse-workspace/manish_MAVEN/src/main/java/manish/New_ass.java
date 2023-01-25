package manish;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_ass {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe"); 
	       WebDriver driver=new ChromeDriver();

		
		      driver.get("https://www.google.com");
		   
		    String a= driver.getCurrentUrl();
		     System.out.println(a);
		     
		     String b= driver.getCurrentUrl();
		     System.out.println(a);
		     
		      
		       if(a.equals(b))
		       {
		    	   System.out.println("pass");
		       }
		       else {
		    	   System.out.println("fail");
		       }	
		       
		       driver.close();

	}

}
