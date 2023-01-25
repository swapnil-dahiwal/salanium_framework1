package swapnil;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllinktexton_webpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\LENOVO\\\\eclipse-workspace\\\\manish\\\\chromedriver.exe");
		WebDriver swapnil=new ChromeDriver();
		
		swapnil.get("https://www.google.com/");
		List<WebElement> linkss=swapnil.findElements(By.tagName("a"));
		System.out.println(linkss.size());
		
		for(WebElement a:linkss) {
			System.out.println(a.getText());
		}
		//
	}

}
