package Test_layer;


import org.testng.annotations.Test;
import BaseLayer.BaseClass;
import Utilil_Layer.BrokenLinkHandler;


public class TestClass extends BaseClass{  // creating  BaseClass and extends here

	@Test(priority=0)
	public void setUp() throws Exception 
	{
     BaseClass.initlizationDemo();
     
     BrokenLinkHandler.ValidateAlllink();
   
		
	}
	
  
}
