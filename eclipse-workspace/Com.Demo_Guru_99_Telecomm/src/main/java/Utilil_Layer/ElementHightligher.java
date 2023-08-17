package Utilil_Layer;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import BaseLayer.BaseClass;

/* this method use after the scrpit as method for highlight the element
 * 
 * 
 */


public class ElementHightligher extends BaseClass{
                    
	public static WebElement findElement(By by)
	{
	    WebElement elem = driver.findElement(by);

	    if (driver instanceof JavascriptExecutor) {
	      ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='4px solid red'", elem);
	    }

	    return elem;
	  }

}
