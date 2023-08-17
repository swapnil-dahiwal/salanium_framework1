package Utilil_Layer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import BaseLayer.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowser extends BaseClass{
	
	
	public static WebDriver openChromeDriver() throws Exception
	{
		   ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver(options);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.com/");
		return driver;
		
	}
	
	public static WebDriver openFireFoxDriver() throws Exception
	{
		WebDriver driver;
		WebDriverManager.firefoxdriver().setup();
		driver =new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		return driver;
		
	}
	public static WebDriver openIeDriver() throws Exception
	{
		WebDriver driver;
		WebDriverManager.iedriver().setup();
		driver =new InternetExplorerDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		return driver;
		
	}
	public static WebDriver openEdgeDriver() throws Exception
	{
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver =new EdgeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		return driver;
		
	}

}
