package Demo2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Checkingdriver  {
	
	private static WebDriver driver;
	private static String baseurl="https://www.facebook.com";
	
	
	public static void intilazation() {

		String browser="chrome";

		if(browser.equalsIgnoreCase("chrome")) 
		{
		
				WebDriverManager.chromedriver().setup();
		        driver=new ChromeDriver();
		}		
		
		else if(browser.equalsIgnoreCase("firefox")) 
		{
		
				WebDriverManager.firefoxdriver().setup();
		        driver=new FirefoxDriver();
		}		
		else if (browser.equalsIgnoreCase("Edge")) {
			
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else {
			System.out.println("plz enter valid url in baseclass");
		}

		driver.get(baseurl);
		}
	public static void main(String[] args) {
		Checkingdriver.intilazation();
		
	}
	}
