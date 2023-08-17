package Utilil_Layer;

import java.util.Iterator;
import java.util.Set;

import BaseLayer.BaseClass;

public class WindowHandler extends BaseClass{

	public void SwitchTo(int index)
	{
		 
		String w=null;
		 
		    Set<String>  windowIds= driver.getWindowHandles();
		    Iterator<String> itr=windowIds.iterator();
		    
		    for (int i=0;i<=index;i++)
		    {
		    	w=itr.next();
		    }
		    driver.switchTo().window(w);
	
	}
	}
