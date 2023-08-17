package Utilil_Layer;

import org.openqa.selenium.By;

import BaseLayer.BaseClass;

public class date_picker extends BaseClass{
	
	public static void datepickermethod(String monthyear, int date) {
	
		while(true){
			String a=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			System.out.println(a);
			
			if(a.equals(monthyear)){
			                  break;}
			else{
			       driver.findElement(By.xpath("//td[@class='next']")).click();    }
			}
			    {driver.findElement(By.xpath("//td[text()='"+date+"']")).click();
			    }} 
	}