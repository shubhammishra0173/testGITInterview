package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class registration {

	
	public WebDriver driver;
	
	By link = By.xpath("//a[text() ='REGISTER']") ;
	By Firstname = By.name("firstName");
	
	By lastname = By.name("lastName");
	
	By phone = By.name("phone");
	
	By mail = By.id("userName");
	
	By address = By.name("address1");
	
	By city = By.name("city");
	
	By state = By.name("state");
	
	By country = By.xpath("//select[@name='country']");
	
	By user = By.name("email");
	
	By pass = By.name("password");
	By confirmpass = By.name("confirmPassword");
	
	By submit   = By.name("register");
	By sign = By.xpath("//a[text()=' sign-in ']");

	public registration(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getLink()
	{
		return driver.findElement(link);
	}
			
	public WebElement getFirstname()
	{
		return driver.findElement(Firstname);
	}
	public WebElement getlasttname()
	{
		return driver.findElement(lastname);
	}
	
	public WebElement getphone()
	{
		return driver.findElement(phone);
	}

	public WebElement getmail()
	{
		return driver.findElement(mail);
	}
	public WebElement getaddress()
	{
		return driver.findElement(address);
	}
	public WebElement getcity()
	{
		return driver.findElement(city);
	}
	public WebElement getstate()
	{
		return driver.findElement(state);
	}
	
	public WebElement getcountry()
	{
		return driver.findElement(country);
	}
	
	public WebElement getnewusername()
	{
		return driver.findElement(user);
	}
	
	public WebElement getnewpass()
	{
		return driver.findElement(pass);
	}
	public WebElement getcnfmpass()
	{
		return driver.findElement(confirmpass);
	}
	public WebElement getsubmit()
	{
		return driver.findElement(submit);
	}
	public WebElement getSign()
	{
		return driver.findElement(sign);
	}
	
}
