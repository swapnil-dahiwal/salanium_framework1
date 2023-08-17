package Test_layer;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import Page_Layer.Page_1_home;

public class Test_class_home_page extends BaseClass {

  @BeforeMethod
		public void setUp() throws Exception {
	     BaseClass.initlizationDemo();
  }	
 
  @Test(priority=0)
	public void homePagefunction() throws IOException 
  {
    
	Page_1_home p=new Page_1_home();
	Assert.assertEquals(driver.getTitle(), "Guru99 Telecom");
	p.homePageFunctality();
 
  }	

	}

