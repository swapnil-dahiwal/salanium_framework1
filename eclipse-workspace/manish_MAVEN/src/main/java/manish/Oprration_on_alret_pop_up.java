package manish;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oprration_on_alret_pop_up {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe" );
	
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			
			driver.findElement(By.name("proceed")).click();
			
			Thread.sleep(3000);
			//switch focus from  main window to alret
			
			Alert alt=driver.switchTo().alert();
			
			String a=alt.getText();
			System.out.println(a);
			
			if (a.equals("user name"))
			{
				System.out.println("TEST CASE PASS");
			}
			else 
			{
				System.out.println("TEST CASE FAIL");
			}
			alt.accept();
			
			driver.close();
		
			
			
	
	}

}
