package Demo2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelSheetReader {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		File f=new File("C:\\Users\\LENOVO\\OneDrive\\Documents\\excelreader.xlsx");
		
		System.out.println(f.exists());
		
		FileInputStream fis=new FileInputStream(f);
		
		XSSFWorkbook wk=new XSSFWorkbook(fis);
		
		XSSFSheet sh= wk.getSheet("Sheet1");
		
	    String a= sh.getRow(0).getCell(0).getStringCellValue();

		System.out.println(a);
		
	    driver.get("https://www.amazon.in/");
	    Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys(a);
		
		
	}

}
