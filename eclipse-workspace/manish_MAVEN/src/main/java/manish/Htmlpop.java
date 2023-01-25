package manish;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Htmlpop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/LENOVO/Desktop/Class%20Practice%20HTML%20code/Class%20Practice%20HTML%20code/alertHtml.html");

		driver.findElement(By.tagName("button")).click();
		Thread.sleep(2000);
	    Alert alt=driver.switchTo().alert();
	    
	   String a=alt.getText();
	   System.out.println(a);
	   
	   if(a.contains("press"))
	   {
		   System.out.println("test pass");
	   }
	   else {
		   System.out.println("fail");
	   }
	   alt.accept();
	}

}
