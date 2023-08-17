package Utilil_Layer;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class Freame_Handle_Method extends BaseClass {
	
	public static void by_Using_Frame_index(int index) {
		
		driver.switchTo().frame(index);
	}
	public static void by_Using_Frame_nameorid(String value) {
		driver.switchTo().frame(value);
	}
  public static void by_Using_frame_WebElement(WebElement wb) {
	  
	  driver.switchTo().frame(wb);
  }
  public static void to_parentframe() {
	  driver.switchTo().parentFrame();
  }
  
  public static void to_top_frame() {
	  
	  driver.switchTo().defaultContent();
  }
}
