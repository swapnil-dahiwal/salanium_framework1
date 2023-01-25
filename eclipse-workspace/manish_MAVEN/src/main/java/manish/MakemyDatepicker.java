package manish;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakemyDatepicker {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.flipkart.com/search?q=iphone");
		 
		 
	List<WebElement> ls=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	
    	System.out.println(ls.size());
	
	for(WebElement abc:ls)
	{
		
		System.out.println(abc.getText()+"\n\n");
		
	}

	}

}
