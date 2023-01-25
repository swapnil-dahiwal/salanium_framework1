package manish;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_baisc {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.amazon.in/s?k=samsung+m32&crid=268GMNFL20A73&sprefix=samsung%2Caps%2C494&ref=nb_sb_ss_ts-doa-p_3_7");
		 
		List<WebElement> ls=driver.findElements(By.xpath("//span[contains(text(),'Samsung')]"));

		System.out.println(ls.size());
		for (WebElement abc:ls)
		{ System.out.println("model number ");
			System.out.println(abc.getText());
		}
	}

}
