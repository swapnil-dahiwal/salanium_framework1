package Test_layer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import BaseLayer.BaseClass;



public class Test_class_add_customer extends BaseClass {
	@Test()
	public void setup() throws Exception {
		BaseClass.initlizationDemo();
		driver.get("https://demo.guru99.com/telecom/addcustomer.php");	
	}
	
	@Test()
	public void tvalidateAddFuncationlity() throws Exception 
	{
		driver.findElement(By.xpath("//label[@for='done']")).click();
		WebElement fname=driver.findElement(By.xpath("//input[@id='fname']"));
		fname.click();
		fname.sendKeys("swapnil");
		Thread.sleep(2000);
		
		WebElement lname=driver.findElement(By.xpath("//input[@id='lname']"));
		lname.click();
		lname.sendKeys("dahiwal");
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.click();               
		email.sendKeys("swapnil@gmail.com");
		
		WebElement address=driver.findElement(By.xpath(" //textarea[@id='message']"));
		address.click();                 
		address.sendKeys("katraj pune");
		
		WebElement mobileno=driver.findElement(By.xpath("//input[@id='telephoneno']"));
		mobileno.click();               
		mobileno.sendKeys("9999999999999");
		
		WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();  
		 
		WebElement idpage=driver.findElement(By.xpath("//table[@class='alt access']//td[2]"));
		System.out.println("customer ID  "+idpage.getText());
		
		
		WebElement homepage=driver.findElement(By.xpath("//a[@class='button']"));
		homepage.click();  
		
	     Thread.sleep(2000);
	   


	     


	       

	   
		
	}
	
}
