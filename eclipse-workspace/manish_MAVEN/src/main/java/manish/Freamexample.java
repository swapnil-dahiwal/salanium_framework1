package manish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Freamexample {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://praf002.github.io/");
		 
//- 1)Enter the full name
		 
			driver.findElement(By.id("name")).sendKeys("Automation Testing");	
		 
//-2) switch to address frame and enter the Pune Text 
		
			driver.switchTo().frame(1);
			driver.findElement(By.id("add")).sendKeys("Pune MH");
			Thread.sleep(2000);
			
			
			
			
		
//-3) switch to tool name frame and select the jenkins value from drop down			
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='Frame4.html']")));
			WebElement wb =driver.findElement(By.id("course"));	
			Select sel =new Select(wb);
			sel.selectByValue("9");
			Thread.sleep(2000);

		 
//- 4)switch to selenium link frame and capture the link name	
			
			driver.switchTo().frame(0);
			String b =driver.findElement(By.xpath("//a[text()='Selenium']")).getText();
			System.out.println(b);
		
		
		 
//-5)It will switch to immediate parent frame		
		

			Thread.sleep(2000);
			driver.switchTo().parentFrame();
		
		 
		 
// 6)..switch to tool name frame and capture the selected value from drop down
			
			WebElement abc =sel.getFirstSelectedOption();
			String c =abc.getText();
			System.out.println(c);		 
//-7) switch to mobile no frame and enter the text.	
			
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			
			driver.switchTo().frame(0);
			WebElement wb3 =driver.findElement(By.id("mob"));
			wb3.sendKeys("432445677");
			System.out.println(wb3.getAttribute("value"));
		 
	}

}
