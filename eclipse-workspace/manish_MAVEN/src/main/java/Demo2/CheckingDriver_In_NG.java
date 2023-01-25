package Demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckingDriver_In_NG {

	private WebDriver driver;
	
	@Parameters({"browser"})
	@Test
	public void m1(String browser ) {
		
		
	
		
		if(browser.equalsIgnoreCase("chrome")) 
		{
		
				WebDriverManager.chromedriver().setup();
		        driver=new ChromeDriver();
		}	
	}
	
	
	
}
