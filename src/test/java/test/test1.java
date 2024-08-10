package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.page1;

public class test1{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}

	@BeforeMethod
	public void url()
	{
		driver.get("https://blazedemo.com/register");

	}
	 @Test
	public void testlogin()
	{
		 
		 page1 ob=new page1(driver);
		 ob.setvalues("mahithaharish", "luminar", "mahithaharish@gmail.com", "Abcdefgh@7", "Abcdefgh@7");
		 
	}
	
	
	
	
	
	
	

	
	
	
	
	
	
	
}






