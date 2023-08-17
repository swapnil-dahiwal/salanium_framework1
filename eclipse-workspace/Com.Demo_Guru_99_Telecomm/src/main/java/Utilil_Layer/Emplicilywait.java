package Utilil_Layer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class Emplicilywait extends BaseClass{

	public static WebElement Ewait (String xpathforelement){
		WebDriverWait emplicitliwaits=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement e=emplicitliwaits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("+xpathforelement+")));
		return e;
	
	}

}
