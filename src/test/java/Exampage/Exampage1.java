package Exampage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class Exampage1 {
	WebDriver driver;
	
	By logo=By.xpath("//*[@id=\"header\"]/div/div/section[2]/div/div/div/section/div/div/div/div/div/header[2]/div/div[2]/div/a/span/img");
	By search=By.xpath("//*[@id=\"header\"]/div/div/section[2]/div/div/div/section/div/div/div/div/div/header[2]/div/div[4]/div[1]");
	By sarees=By.xpath("//*[@id=\"search-header\"]/form/input");
	By firstsaree=By.xpath("//*[@id=\"Wplgnite-shop\"]/div[10]/div/div[1]/div[2]/a");
	
	
	
	public Exampage1(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void checkLogo()
	{
		Boolean b=driver.findElement(logo).isDisplayed();
		if(b)
		{
			System.out.println("displayed");
				
		}
		else
		{
			System.out.println("not displayed");
		}
	}
	public void searchSarees() 
	{
		driver.findElement(search).click();
	}
	public void enterSarees(String ss)
	{
		driver.findElement(sarees).sendKeys(ss,Keys.ENTER);
		
	}
	public void clickFirstSaree()
	{
		JavascriptExecutor js= (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].scrollIntoView();",driver.findElement(firstsaree));
    	WebElement mouse=driver.findElement(firstsaree);
    	Actions act=new Actions(driver);
    	act.moveToElement(mouse).perform();
    	mouse.click();
    	driver.navigate().back();
    	driver.navigate().back();
	}
	
	

}
