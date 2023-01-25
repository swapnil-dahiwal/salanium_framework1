package NG_program;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {
	
	
	@Test(priority=0)
	public void loginpage() {
		
		System.out.println("login");
	}
	// hard depends on methods   alwaysrun=true
	
	@Test(priority=1,dependsOnMethods= {"loginpage"})
	public void homepage() {
		Assert.assertEquals("sss", "ss");;
	}
	
    //soft depends on alway run
	
	@Test(priority=2,dependsOnMethods= {"homepage"})
	public void pimpage() {
		
		System.out.println("pimpage");
	}
}
