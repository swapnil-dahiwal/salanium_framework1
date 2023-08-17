package Page_Layer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import Utilil_Layer.BrokenLinkHandler;

public class Page_1_home extends BaseClass{

	@FindBy(xpath="//a[@class='logo']")  private WebElement logo;
	@FindBy(xpath="//section[@id='one']")  private WebElement pagetext;
	
	public Page_1_home()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void homePageFunctality() throws IOException 
	{
		
	
		System.out.println("logo display "+logo.isDisplayed());
		System.out.println("ALL page text :: "+pagetext.getText());
	
	   
	}
	
	
}
