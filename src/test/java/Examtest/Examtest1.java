package Examtest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Exampage.Exampage1;


public class Examtest1 {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}

	@BeforeMethod
	public void urlOpen()
	{
		driver.get("https://malathisilks.com/");
				
	}
	@Test
	public void page() throws Exception
	{
		Exampage1 ob=new Exampage1(driver);
		ob.checkLogo();
		ob.searchSarees();
		ob.enterSarees("sarees");
		ob.clickFirstSaree();
			
	}
	 @AfterMethod
	   public void close()
	   {
		  driver.close(); 
	   }
}
