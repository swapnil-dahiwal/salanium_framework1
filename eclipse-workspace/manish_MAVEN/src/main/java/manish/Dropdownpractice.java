package manish;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownpractice {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe");
		 
		  
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.facebook.com/reg");
		  
		   Select sel =new Select(driver.findElement(By.id("month")));
		   
		   sel.selectByVisibleText("Aug");
		   
		      List <WebElement> all=sel.getOptions();
		      
		      for(WebElement option:all)
		      {
		    	 if(option.getText().equals("Aug"))
		    	 {
		    		System.out.println("pass");
		    	 }
		      }
		   
	}}


		
		 
		  
		  
		  
		  
		  
		  
		  
		  

	


