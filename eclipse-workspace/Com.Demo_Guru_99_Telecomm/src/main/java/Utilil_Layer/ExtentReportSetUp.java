package Utilil_Layer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseLayer.BaseClass;

public class ExtentReportSetUp extends BaseClass {

	public static ExtentReports extent;

	public static ExtentReports extentreportsetUp() {

		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(
				"C:\\Users\\LENOVO\\eclipse-workspace\\Aug2022_HybridFramework\\Reports\\" + getDate()
						+ "extentreport.html");
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		sparkReporter.config().setDocumentTitle(" Test Cases");
		return extent;
	}

	public static String getpassscreenshot(String Screenshotname) throws IOException {

		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String dist = System.getProperty("user.dir") + "\\PassScreenshot\\" + Screenshotname + getDate() + ".png";

		FileUtils.copyFile(f, new File(dist));

		return dist;
	}

	public static String getfailscreenshot(String screenshotname) throws IOException {

		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String dist = System.getProperty("user.dir") + "\\FailScreenShot\\" + screenshotname + getDate() + ".png";
		FileUtils.copyFile(f, new File(dist));
		return dist;
	}

	public static String getDate() {
		return new SimpleDateFormat("ddmmyyyy_hhmmss").format(new Date());

	}

}
