package Test_layer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import Utilil_Layer.JavascriptExecutormethod;
import Utilil_Layer.TestBrowser;

public class Orange_hrm_page extends BaseClass{
 
	
	@Test(priority=0)
	public void setUp() throws Exception 
	{
		driver=TestBrowser.openChromeDriver();
		driver.get("https://dilip-trials77.orangehrmlive.com/auth/login");
	    System.out.println("Title for site page "+driver.getTitle());
	}
	
	@Test (priority=1)
	public void loginfuncationality() 
	
	{
		 System.out.println("Title for Login page "+driver.getTitle());
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.click();
		username.sendKeys("Admin");
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.click();
		password.sendKeys("HRbsRJs43@");
		driver.findElement(By.xpath("//*[@type='submit']")).click();	
	}
	@Test(priority=2)
	public void Add_emplyee() throws InterruptedException
	{    System.out.println("Title for add emplyee "+driver.getTitle());
		//driver.findElement(By.xpath("/li[@id='left_menu_item_30']//a[1]//span[1]")).click();
		
		
		WebElement myinfo=driver.findElement(By.xpath("//a[normalize-space()='My Info']"));
		myinfo.click();
		WebElement firstname=driver.findElement(By.xpath("//input[@id='firstName']"));
		Actions act=new Actions(driver);
		act.doubleClick(firstname).build().perform();
		firstname.sendKeys("ganesh");
		
		WebElement lastname=driver.findElement(By.xpath("//input[@id='lastName']"));
		act.doubleClick(lastname).build().perform();
		lastname.sendKeys("waykule");
		String empId=driver.findElement(By.xpath("//input[@id='employeeId']")).getText();
		    System.out.println("employee id :: "+empId);
		WebElement cal1=driver.
		findElement(By.
	    xpath("(//i[@class='material-icons action-icon date-picker-open-icon'][normalize-space()='date_range'])[1]"));
		cal1.click();
		Thread.sleep(2000);
		cal1.click();
	     
	
	}
	
}
