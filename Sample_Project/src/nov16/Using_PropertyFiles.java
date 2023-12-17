package nov16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Using_PropertyFiles

{
	WebDriver driver;
	Properties conpro;
	@BeforeTest
	public void setUp() throws Throwable
	{
		conpro = new Properties();
		//load property file
		conpro.load(new FileInputStream("login.properties"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(conpro.getProperty("Url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	@Test
	public void starttest()
	{
		driver.findElement(By.xpath(conpro.getProperty("Objuser"))).sendKeys("Enteruser");
		driver.findElement(By.xpath(conpro.getProperty("Objpass"))).sendKeys("Enterpass");
		driver.findElement(By.xpath(conpro.getProperty("ObjLogin"))).click();
		String Expected = "dashboard";
		String Actual = driver.getCurrentUrl();
		if(Actual.contains(Expected))
		{
			Reporter.log("Login Success::"+Expected+"   "+Actual,true);
			
		}else
		{
			Reporter.log("Login Fail::"+Expected+"     "+Actual,true);
		}
		
		
	}
	@AfterTest
	public void tearDown()
	{
		
		driver.quit();
	}

}
