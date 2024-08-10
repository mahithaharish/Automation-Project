package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class page1 {
	WebDriver driver;
	By name=By.name("name");
	By companyname=By.name("company");
	By emailid=By.name("email");
	By password=By.name("password");
	By confirm=By.name("password_confirmation");
	By registerbutton=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	
	public page1(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String name, String company, String email, String password, String confirm)
	{
	
		//driver.findElement(name).sendKeys(name);
		driver.findElement(companyname).sendKeys(company);
		driver.findElement(emailid).sendKeys(email);
		//driver.findElement(password).sendKeys(password);
		//driver.findElement(confirm).sendKeys(confirm);
		
	}
	
	public void login()
	{
		driver.findElement(registerbutton).click();
	}
	
	
	
	
	

}
