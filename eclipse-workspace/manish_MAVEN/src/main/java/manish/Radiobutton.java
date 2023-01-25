package manish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe"); 

	       WebDriver driver=new ChromeDriver();
	       
	       driver.get("https://prafpawar11.github.io/radiobutton.html");
	       
	     boolean redselect= driver.findElement(By.id("pune")).isSelected();
	     System.out.println("radio button selected pune "+redselect);
	     
	     driver.findElement(By.id("pune")).click();
	     
	     Thread.sleep(3000);
	     boolean redselect1= driver.findElement(By.id("pune")).isSelected();
	     System.out.println("radio button selected pune "+redselect1);
	     
	     boolean redselectmum= driver.findElement(By.id("mumbai")).isSelected();
	     System.out.println("radio button selected mumbai "+redselectmum);
	     
	     driver.findElement(By.id("mumbai")).click();
	     
	     boolean redselectmum1= driver.findElement(By.id("mumbai")).isSelected();
	     System.out.println("radio button selected mumbai "+redselectmum1);
	     
	     boolean redselect12= driver.findElement(By.id("pune")).isSelected();
	     System.out.println("radio button selected pune "+redselect12);
	}

}
