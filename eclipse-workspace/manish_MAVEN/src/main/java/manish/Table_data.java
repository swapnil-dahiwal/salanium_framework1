package manish;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Table_data {

	@Test
	public  void tabledata() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
	driver.get("file:///C:/Users/LENOVO/Desktop/Class%20Practice%20HTML%20code/Class%20Practice%20HTML%20code/table.html");
	
	List<WebElement>clm=driver.findElements(By.tagName("tr"));
	System.out.println(clm.size());
	for(WebElement abc:clm) {
		System.out.println(abc.getText());
	}
}}


