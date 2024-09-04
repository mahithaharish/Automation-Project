package ProjectTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ProjectPage.KsrtcPage;


public class KsrtcTest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}

	@BeforeMethod
	public void urlOpen()
	{
		driver.get("https://onlineksrtcswift.com/");
				
	}
	@Test
	public void homepage() throws Exception
	{
		KsrtcPage ob=new KsrtcPage(driver);
		ob.closeButton();
		ob.windowMaximise();
		ob.contactUs();
		ob.Cancellation();
		ob.Feedback();
		ob.Gallery();
		ob.image1Mousehover();
		ob.image2Mousehover();
		ob.image3Mousehover();
		ob.image4Mousehover();
		ob.image5Mousehover();
		ob.statusCheck();
		ob.Booking();
		ob.viewBooking();
		ob.typePnr("6282144-58290");
		ob.viewbookingButtonClick();
		ob.screenshot();
		ob.backToHomepage();
		ob.clickCounterLogin();
		ob.newWindow();
		ob.gotoHome();
		ob.closewindowagain();
		ob.clickDate();
		ob.selectDate();
		ob.clickSearchBus();
		ob.clickBusType();
		ob.selectAC();
		ob.clickSelectBerth();
		ob.closewindowagain2();
	  }
	   @AfterMethod
	   public void close()
	   {
		  driver.quit(); 
	   }
	

}
