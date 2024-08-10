package Pkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	ChromeDriver driver;
	@Test
	public void test()
	{
		driver.get("https://www.facebook.com");
	}

}
