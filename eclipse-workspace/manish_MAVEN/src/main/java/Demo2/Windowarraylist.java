package Demo2;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Windowarraylist {
	
	public static WebDriver driver;
	public static String hrm;                      // normal way ho handle multiwindow using parent id
	public static String facebook;
	public static Set<String> allchild_one;
	
	public static void Dropdown(WebElement wb,String value) {
		
		Select sel=new Select(wb);
		
		sel.selectByVisibleText(value);}

	public static void twowinhandle(Set<String> allchild_one,String parent) {
	    
	      for (String s:allchild_one) {
	    	  if(!(s.equals(parent))){
	    		  driver.switchTo().window(s);
	    		  hrm=s;
	  		  System.out.println("hrm id..."+hrm); }}}
	
	
	public static void threewinhandle(Set<String> allchild_one,String parent,String hrm) {
		
		for(String xyz:allchild_one) {
			
			if(!(xyz.equals(parent))&&(!(xyz.equals(hrm)))){
				
				driver.switchTo().window(xyz);
				facebook=driver.getWindowHandle();
				
				System.out.println("facebook id..:-"+facebook);
			}}}

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://prafpawar11.github.io/multiplewindows.html");
		
	String parent=driver.getWindowHandle();
	System.out.println("parent id..:-"+parent);
	
	driver.findElement(By.name("fname")).sendKeys("swapnil");
	driver.findElement(By.xpath("//a[1]")).click();
	 
	Thread.sleep(3000);
	allchild_one=driver.getWindowHandles();
	Windowarraylist.twowinhandle(allchild_one, parent);
	
	Actions act=new Actions(driver);
	 WebElement wb=driver.findElement(By.id("txtUsername")); 
	 act.sendKeys(wb,"Admin").sendKeys(Keys.TAB,"admin123").sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
	 Thread.sleep(3000);
	 
	 
	 
	driver.switchTo().window(parent);	
	driver.findElement(By.xpath("//a[2]")).click();
	 allchild_one=driver.getWindowHandles();
	Windowarraylist.threewinhandle(allchild_one, parent, hrm);
	Thread.sleep(3000);
	 
	WebElement day =driver.findElement(By.id("day"));
	
	Windowarraylist.Dropdown(day, "23");
	
	WebElement month =driver.findElement(By.id("month"));
	Windowarraylist.Dropdown(month,"Aug");

	
	WebElement year =driver.findElement(By.id("year"));
	Windowarraylist.Dropdown(year, "2010");
	
	Thread.sleep(3000);
	
	
	
	driver.switchTo().window(parent);
	
	driver.findElement(By.name("lname")).sendKeys("dahiwal");
	Thread.sleep(3000);
	
	driver.switchTo().window(hrm);
	
	System.out.println(driver.getTitle());
	Thread.sleep(3000);
	
	driver.switchTo().window(facebook);
	
	driver.findElement(By.name("reg_email__")).sendKeys("123456789");
	Thread.sleep(3000);
	
	driver.switchTo().window(parent);
	
	driver.findElement(By.name("address")).sendKeys("pune");
	Thread.sleep(5000);
	driver.quit();
	
	
		

	}

}
