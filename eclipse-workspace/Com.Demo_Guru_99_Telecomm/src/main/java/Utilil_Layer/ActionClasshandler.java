package Utilil_Layer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClass;

public class ActionClasshandler extends BaseClass{

	public static void click_method(WebElement wb) 
	{	
		new Actions(driver).contextClick(wb).build().perform();
	}

	public static void right_click_method(WebElement wb)
	{
		
		new Actions(driver).contextClick(wb).build().perform();
		
	}
	public static void move_element_method(WebElement wb )
	{
		
		new Actions (driver).moveToElement(wb).build().perform();
	}
	
	public static void drag_and_drop_method(WebElement src, WebElement target) 
	{
		
		new Actions(driver).dragAndDrop(src, target).build().perform();
	}
	public static void realease_method(WebElement wb) 
	{
		
		new Actions (driver).release(wb).build().perform();
	}
	
	public static void click_and_hold_mathod(WebElement wb ,WebElement target)
	{
		
		new Actions (driver).clickAndHold().build().perform();
	}
	
	public static void double_click_method(WebElement wb) {
		
		new Actions(driver).doubleClick().build().perform(); 
	}
	public static  void enter_data_Method(WebElement wb, String value) {
		
		new Actions (driver).sendKeys(wb, value).build().perform();
	}
   public static  void Copy_All_Data_Mathod(WebElement wb ) {
		
		new Actions (driver).keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
	}
	
   public static void paste_data_method(WebElement wb) {
	   
	   new Actions (driver).keyDown(Keys.CONTROL).sendKeys("v").build().perform();
	}

}
