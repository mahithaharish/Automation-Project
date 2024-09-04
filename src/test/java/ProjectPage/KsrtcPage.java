package ProjectPage;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KsrtcPage {
	WebDriver driver;
	By close=By.xpath("//*[@id=\"body\"]/div[5]/div/a");
	By contactus=By.xpath("//*[@id=\"outerWrapper\"]/div[2]/div[1]/ul/li[1]/a");
	By cancellation=By.xpath("//*[@id=\"outerWrapper\"]/div[2]/div[1]/ul/li[2]/a");
	By feedback=By.xpath("//*[@id=\"outerWrapper\"]/div[2]/div[1]/ul/li[3]/a");
	By gallery=By.xpath("//*[@id=\"outerWrapper\"]/div[2]/div[1]/ul/li[5]/a");
	By image1=By.xpath("//*[@id=\"photoGalleryWrap\"]/div[1]/div[2]/div/a[1]");
	By image2=By.xpath("//*[@id=\"photoGalleryWrap\"]/div[1]/div[2]/div/a[2]");
	By image3=By.xpath("//*[@id=\"photoGalleryWrap\"]/div[1]/div[2]/div/a[3]");
	By image4=By.xpath("//*[@id=\"photoGalleryWrap\"]/div[1]/div[2]/div/a[4]");
	By image5=By.xpath("//*[@id=\"photoGalleryWrap\"]/div[1]/div[2]/div/a[5]");
	By statuscheck=By.xpath("//*[@id=\"outerWrapper\"]/div[2]/div[1]/ul/li[8]/a");
	By booking=By.xpath("/html/body/header/div[2]/div[1]/ul/li[4]/a");
	By viewbooking=By.xpath("/html/body/header/div[2]/div[1]/ul/li[4]/ul/li/a");
	By pnrno=By.name("pnrNo");
	By viewbookbutton=By.xpath("//*[@id=\"view_booking\"]/form/div[5]/input");
	By counterlogin=By.xpath("//*[@id=\"outerWrapper\"]/div[2]/div[1]/ul/li[7]/a");
	By login=By.id("submit");
	By ok=By.xpath("/html/body/div[3]/div/div/div[3]/div/div/button");
	By home=By.xpath("//*[@id=\"outerWrapper\"]/div[1]/header/div/div[2]/a");
	By close2=By.xpath("//*[@id=\"body\"]/div[5]/div/a");
	By date=By.xpath("/html/body/div[2]/section[1]/div[3]/div[2]/div[1]/form/div/div[2]/div[2]/div[1]/div/div[1]/div[2]/input");
	By datepick=By.xpath("/html/body/div[6]/div[2]/table/tbody/tr[5]/td[1]/a");
	By searchbus=By.xpath("//*[@id=\"submitSearch\"]");
	By bustype=By.xpath("//*[@id=\"root\"]/div/div[2]/section[2]/div[1]/div[2]/div/span");
	By check=By.xpath("//*[@id=\"root\"]/div/div[2]/section[2]/div[1]/div[2]/div[2]/div[2]/label[1]/span[2]");
	By berth=By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div[4]");
	By close3=By.xpath("//*[@id=\"body\"]/div[5]/div/a");
	
	
	
	public KsrtcPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void closeButton()
	{
		driver.findElement(close).click();
	}
	public void windowMaximise()
	{
		driver.manage().window().maximize();
	}
	public void contactUs()
	{
		driver.findElement(contactus).click();
	}
	public void Cancellation()
	{
		driver.findElement(cancellation).click();
	}
	public void Feedback()
	{
		driver.findElement(feedback).click();
	}
	public void Gallery()
	{
		driver.findElement(gallery).click();
	}
	public void image1Mousehover()
	{
		WebElement photo1=driver.findElement(image1);
		Actions act=new Actions(driver);
	    act.moveToElement(photo1).perform();
	}
	public void image2Mousehover()
	{
		WebElement photo2=driver.findElement(image2);
		Actions act=new Actions(driver);
	    act.moveToElement(photo2).perform();
	}
	public void image3Mousehover()
	{
		WebElement photo3=driver.findElement(image3);
		Actions act=new Actions(driver);
	    act.moveToElement(photo3).perform();
	}
	public void image4Mousehover()
	{
		WebElement photo4=driver.findElement(image4);
		Actions act=new Actions(driver);
	    act.moveToElement(photo4).perform();
	}
	public void image5Mousehover()
	{
		WebElement photo5=driver.findElement(image5);
		Actions act=new Actions(driver);
	    act.moveToElement(photo5).perform();
	}
	public void statusCheck()
	{
		driver.findElement(statuscheck).click();
	}
	public void Booking()
	{
		WebElement bk=driver.findElement(booking);
		Actions act=new Actions(driver);
	    act.moveToElement(bk).perform();
	}
	public void viewBooking()
	{
		driver.findElement(viewbooking).click();
	}
	public void typePnr(String pnr)
	{
		driver.findElement(pnrno).sendKeys(pnr);
	}
	public void viewbookingButtonClick()
	{
		driver.findElement(viewbookbutton).click();
	}
	public void screenshot() throws Exception
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("./Screenshot//ksrtc.png"));	
	}
	public void backToHomepage()
	{
		driver.navigate().back();
	}
	public void clickCounterLogin()
	{
		driver.findElement(counterlogin).click();
	}
	public void newWindow()
	{
		String parentWindow = driver.getWindowHandle();
    	for (String windowHandle : driver.getWindowHandles())
    	{
    	    if (!windowHandle.equals(parentWindow))
    	    {
    	        driver.switchTo().window(windowHandle);
    	        break;
    	    }
    	    
    	}
    	driver.findElement(login).click();
    	driver.switchTo().window(parentWindow);
	}
	public void gotoHome()
	{
		driver.findElement(home).click();
	}
	public void closewindowagain()
	{
		driver.findElement(close2).click();
	}
	public void clickDate() 
	{
		WebElement cd=driver.findElement(date);
		Actions act=new Actions(driver);
	    act.moveToElement(cd).perform();
	    cd.click();
	  
	}
	public void selectDate()
	{
		WebElement dd=driver.findElement(datepick);
		Actions act=new Actions(driver);
	    act.moveToElement(dd).perform();
	    dd.click();
	}
	public void clickSearchBus()
	{
		WebElement s=driver.findElement(searchbus);
		Actions act=new Actions(driver);
	    act.moveToElement(s).perform();
	    s.click();	
	}
	public void clickBusType()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement bstype = wait.until(ExpectedConditions.elementToBeClickable(bustype));
    	bstype.click();
	}
	public void selectAC()
	{
		WebElement checkbox=driver.findElement(check);
		Actions act=new Actions(driver);
	    act.moveToElement(checkbox).perform();
	    checkbox.click();	  
	}
	public void clickSelectBerth()
	{
		driver.findElement(berth).click();
		driver.navigate().back();
	}
	public void closewindowagain2()
	{
		driver.findElement(close3).click();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	


}
