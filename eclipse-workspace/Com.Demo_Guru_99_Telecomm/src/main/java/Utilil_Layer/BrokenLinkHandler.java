package Utilil_Layer;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;
public class BrokenLinkHandler extends BaseClass {
	
  public static void ValidateAlllink() throws IOException {
		   
		   List<WebElement> links = driver.findElements(By.tagName("a"));
		   int rescode=200;
		  
			System.out.println("total links in this page ::-"+links.size());

			for (WebElement element:links)

			{ 	  //   WebElement element=links.get(i);
				String url = element.getAttribute("href");

				URL links1= new URL(url);

				HttpURLConnection httpConn = (HttpURLConnection) links1.openConnection();
	                  httpConn.setRequestMethod("GET");
	                  httpConn.connect();
				 rescode = httpConn.getResponseCode();

				if (rescode >= 400) {
					System.err.println(url + "_" + "....is broken link........"  );
					
				} else {
					System.out.println(url + "_" + "....is valid link...");
				}
				}    	
}}
