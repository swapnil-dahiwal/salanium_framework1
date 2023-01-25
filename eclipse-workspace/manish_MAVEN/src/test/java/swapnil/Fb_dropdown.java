package swapnil;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb_dropdown {

	public static void  printall(WebElement wb) {
         Select sel=new Select(wb);
		  List<WebElement>ls=sel.getOptions();  //1 2 3 4 5 6 7 8 
		 for(WebElement a:ls) {System.out.print(a.getText()); }}
	
	public static void main(String[] args) {
		

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		    
		   driver.get("https://www.facebook.com/reg");
		 //  driver.manage().window().maximize();
		   
		  WebElement day= driver.findElement(By.id("day"));
		  Fb_dropdown.printall(day);
		  WebElement month= driver.findElement(By.id("month"));
		  Fb_dropdown.printall(month);
		  WebElement year= driver.findElement(By.id("year"));
		  Fb_dropdown.printall(year);
		
		   
		   
		
	}

}
