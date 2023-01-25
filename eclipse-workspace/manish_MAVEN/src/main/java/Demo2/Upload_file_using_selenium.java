package Demo2;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_file_using_selenium {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com");
		
		driver.findElement(By.xpath("//span[@class='uprcse semi-bold']")).click();
		
		
		
		WebElement wb=driver.findElement(By.xpath("(//input[@id='file-upload'])[2]"));
		
		wb.sendKeys("‪‪C:\\Users\\LENOVO\\eclipse-workspace\\del.docx");
	
		
		
		

	}

}
