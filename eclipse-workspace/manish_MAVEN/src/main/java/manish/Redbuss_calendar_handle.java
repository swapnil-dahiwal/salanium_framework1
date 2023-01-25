package manish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbuss_calendar_handle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.redbus.in/");
		 
		 driver.findElement(By.id("onward_cal")).click();
        
         
        while(true)
        {
        	String a=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
        	System.out.println(a);
        	
        	if(a.equals("Dec 2022"))
        	{
        		break;
        	}
        	else {
        		driver.findElement(By.xpath("//td[@class='next']")).click();
        	}
        	driver.findElement(By.xpath("//td[@class='next']"));
        	driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//td[text()='2']")).click();
        }
         
   }}


