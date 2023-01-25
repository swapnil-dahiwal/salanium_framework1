package swapnil;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hrm_Add_Delete {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\manish\\chromedriver.exe");
 
	WebDriver driver=new ChromeDriver();
		
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
   driver.findElement(By.id("txtUsername")).sendKeys("Admin");
   
   driver.findElement(By.id("txtPassword")).sendKeys("admin123");
   
   driver.findElement(By.id("btnLogin")).click();
   
   driver.findElement(By.id("menu_pim_viewPimModule")).click();
   
   driver.findElement(By.id("btnAdd")).click();
   
   driver.findElement(By.id("firstName")).sendKeys("kri");
   
   driver.findElement(By.id("lastName")).sendKeys("TAK");
   
   String empid= driver.findElement(By.id("employeeId")).getAttribute("value") ;
  
   System.out.println(empid);
   
   driver.findElement(By.id("btnSave")).click();
   
   driver.findElement(By.id("btnSave")).click();

   driver.findElement(By.className("ui-datepicker-trigger")).click();
   
   WebElement years =driver.findElement(By.className("ui-datepicker-year"));
  
   Select sel1=new Select(years);
   
   sel1.selectByVisibleText("2030");
   

	WebElement month =driver.findElement(By.className("ui-datepicker-month"));
	
	Select sel2 =new Select(month);
	
	sel2.selectByVisibleText("Nov");
	
	driver.findElement(By.id("btnSave")).click();
	
	driver.findElement(By.linkText("Job")).click();
	
	driver.findElement(By.id("btnSave")).click();
	
	WebElement jobstatus=driver.findElement(By.id("job_job_title"));
	
	System.out.println(jobstatus);
	
	Select sel3=new Select(jobstatus);
	System.out.println(sel3);
	
	sel3.selectByIndex(1);
	
	Select jobst=new Select(driver.findElement(By.id("job_emp_status")));
	System.out.println(jobst);
	jobst.selectByIndex(2);
	
	Select jobcate =new Select(driver.findElement(By.id("job_sub_unit")));
	jobcate.selectByVisibleText("Engineering");
	
	
	Select contry=new Select(driver.findElement(By.id("job_location")));
	contry.selectByVisibleText("New York Sales Office");
	
	
	driver.findElement(By.id("btnSave")).click();
	
	
	driver.findElement(By.xpath("//*[@id=\"sidenav\"]/li[7]/a")).click();
	
	driver.findElement(By.id("addSalary")).click();
   
	Select gread=new Select(driver.findElement(By.id("salary_sal_grd_code")));
	
	gread.selectByVisibleText("Grade 14");
	
	driver.findElement(By.id("salary_salary_component")).sendKeys("no");
	
	Select payfreq=new Select(driver.findElement(By.id("salary_payperiod_code")));
	payfreq.selectByIndex(3);
	
	//Select curr=new Select(driver.findElement(By.id("salary_currency_id")));
	
    //  curr.selectByIndex(1);
	
	 driver.findElement(By.id("menu_pim_viewPimModule")).click();
	 
//	driver.findElement(By.id("empsearch_id")).sendKeys(empid);
	 
	// driver.findElement(By.id("searchBtn")).click();
	 
	 driver.findElement(By.name("chkSelectRow[]")).isSelected();
	 
	 
	 
	 
	 
	 
	 
	 driver.findElement(By.id("btnDelete")).click();
	 
	 
Thread.sleep(6000);
	


   
		
	}

}
