package Demo2;

import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Basic_annotation {
	
	@BeforeClass
	public void m1() {
		
		System.out.println("@Beforeclass ");
	}
	@AfterClass
	public void m2() {
		
		System.out.println(" @After class ");
	}
	@Test
	public void m3() {
		
		System.out.println(" test case 1 ");	
	}
	@Test
      public void m4() {
		
		System.out.println(" test case 2 ");	
	}
	
	
      
      
      
      
      
}
