package Utilil_Layer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class JavascriptExecutormethod extends BaseClass {
	
	public static void clickonbuttonusingjs(WebElement wb) {
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",wb);
		}
	
	public static void senddatausingjs(String value,WebElement wb) {
		 
		((JavascriptExecutor)driver).executeScript("arguments[0].value='"+value+"'", wb);
	}
   public static void openBroswer(String url) {
	   
	   ((JavascriptExecutor)driver).executeScript("window.location='"+url+"'");
	 }
     
   public static String capturetitlebyusingjs() {
	   return((JavascriptExecutor)driver).executeScript("return document.title").toString();
   }
   public static String captureurlbyusingjs() {
	   return((JavascriptExecutor)driver).executeScript("return document.URL").toString();
   }
   public static void borderOnElement(String elem) {
	   ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'",elem);
   }
   
   public static void drawBorder(WebElement element, WebDriver driver) {
	    JavascriptExecutor js = ((JavascriptExecutor)driver);
	    js.executeScript("aguments[0].style.border='3px solid red'", element);
	}
   
   public static  WebElement findElement(By by)
	 {
	   WebElement elem=driver.findElement(by);

	  if (driver instanceof JavascriptExecutor)
	 {
		   ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid green'",elem);

	 }
	 return elem;
	 }
   
}
