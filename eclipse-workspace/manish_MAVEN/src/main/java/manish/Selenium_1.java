package manish;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver,chrome,driver","C:\\Users\\LENOVO\\eclipse-workspace\\manish\\\\chromedriver.exe");
														
		WebDriver driver =new ChromeDriver();
													
		driver.get("https://www.facebook.com");	
		String a=driver.getTitle();	
		for (int i=a.length()-1;i>=0;i--)
		{
			System.out.println();
		}
		 
		 
	    driver.navigate().to("https://www.google.com/");
	    String b=driver.getTitle();
	    
	    System.out.println(b);
	    
	    if (b.contains("Google"))
	    {
	    	System.out.println("test case pass for google");
	    }
	    else {
	    	System.out.println("test case is fail for google");
	    }
	    
	    Thread.sleep(100);
	    driver.close();
	    
	    
	    
	    
	}

}
