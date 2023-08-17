package Page_Layer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class Page_2_Add_customer extends BaseClass{

	@FindBy(xpath="//div[@class='flex-item left']/div[1]//a")  private WebElement addCustomer;
	
	public Page_2_Add_customer() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public  void validate_Add_customer() 
	{
		addCustomer.click();
		
	}
}
