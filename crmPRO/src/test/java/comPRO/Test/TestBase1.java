package comPRO.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;


import com.OrangeHRM.hybridFramework.utility.ConfigData;
import com.utility.ConfigData1;


public class TestBase1 
{
	public static WebDriver driver=null;
	public static ConfigData1 config=null;
		
	@BeforeSuite
	public void init()
	{
	 config = new ConfigData1();
	 }
	@BeforeClass
	public void Setup()
	{
		
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		 driver=new ChromeDriver();
		 //driver.get("http://classic.crmpro.com");

	
	driver.get(config.getUrl());
	driver.manage().window().maximize();
	}

//	@AfterTest
//	public void tearDown()
//	{
//		driver.quit();
//	}

	}
