package nov16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class AdvanceReports 

{
	ExtentReports reports;
	ExtentTest logger;
	WebDriver driver;
	@BeforeTest
	public void generateReport()
	{
		reports = new ExtentReports("./ExtentReports/Demo.html");

	}

	@BeforeMethod
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");

	}

	@Test
	public void PassTest()
	{
		logger=reports.startTest("passtest");
		logger.assignAuthor("Ranga");
		logger.assignCategory("Functional Testing");
		String Expected = "Google";
		String Actual = driver.getTitle();
		if(Expected.equalsIgnoreCase(Actual))
		{
			logger.log(LogStatus.PASS, "Title is matching::"+Expected+"       "+Actual);

		}else
		{
			logger.log(LogStatus.FAIL, "Title is not matching:::"+Expected+"       "+Actual);

		}

	}

	@Test
	public void failTest()
	{
		logger=reports.startTest("failtest");
		logger.assignAuthor("Ranga");
		logger.assignCategory("Functional Testing");
		String Expected = "gamil";
		String Actual = driver.getTitle();
		if(Expected.equalsIgnoreCase(Actual))
		{
			logger.log(LogStatus.PASS, "Title is matching::"+Expected+"       "+Actual);

		}else
		{
			logger.log(LogStatus.FAIL, "Title is not matching:::"+Expected+"       "+Actual);

		}

	}

	@AfterMethod
	public void teardown()
	{
		reports.endTest(logger);
		reports.flush();
		driver.quit();
	}


}



