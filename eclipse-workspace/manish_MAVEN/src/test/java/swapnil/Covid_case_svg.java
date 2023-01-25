package swapnil;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Covid_case_svg {
	
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search?q=covid+case&rlz=");
		
		List<WebElement>graphlist=driver.findElements(By.xpath("(//*[local-name()='svg' and @class='uch-psvg'])//*[1]//*[name()='rect']"));
		
		 Actions act=new Actions(driver);
		
		for( WebElement e :graphlist)
		{
			act.moveToElement(e).build().perform();
		String record=driver.findElement(By.xpath("//div[@class='ExnoTd']")).getText();
		
			System.out.println(record);
			
		}

	}

}
