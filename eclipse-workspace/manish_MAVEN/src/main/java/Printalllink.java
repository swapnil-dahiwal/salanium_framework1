import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Printalllink {
public static void main(String[] args) {
	

	    WebDriverManager.chromedriver().setup();
	
      WebDriver driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      driver.manage().window().maximize();
      driver.get("https://www.gmail.com/");
    List<WebElement> s= driver.findElements(By.tagName("a"));
     System.out.println(s.size());

     for (WebElement link2: s) {

     //print the links i.e. http://google.com or https://www.gmail.com
          System.out.println(link2.getAttribute("href"));

    //print the links text
   System.out.println(link2.getText());
}
}
}
