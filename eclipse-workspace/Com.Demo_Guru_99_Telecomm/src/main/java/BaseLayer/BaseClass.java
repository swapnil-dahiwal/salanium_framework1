package BaseLayer;



import org.openqa.selenium.WebDriver;


import Utilil_Layer.TestBrowser;


 public class BaseClass {

	public  static WebDriver driver;
	
	public static String url="https://demo.guru99.com/telecom/index.html";
	
	
	public static void initlizationDemo() throws Exception {
		
		driver=TestBrowser.openChromeDriver();
		
		
		
	
	}
}
