package Utilil_Layer;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;

public class ScreenShot_handler extends BaseClass{
	
	
	
	public static void pass_Screenshot_method(String path) throws Exception, IOException {

	 
	 FileUtils.copyFile(((TakesScreenshot)driver)
			 .getScreenshotAs(OutputType.FILE), 
			 new File("C:\\Users\\LENOVO\\eclipse-workspace\\Aug2022_HybridFramework\\PassScreenshot\\"+((new Date()).getTime())+".png"));
	
	}

	public static void fail_Screenshot_method(String path) throws Exception, IOException {

		 
		 FileUtils.copyFile(((TakesScreenshot)driver)
				 .getScreenshotAs(OutputType.FILE), 
				 new File("C:\\Users\\LENOVO\\eclipse-workspace\\Aug2022_HybridFramework\\FailScreenShot\\"+((new Date()).getTime())+".png"));
		
		}
	
}
