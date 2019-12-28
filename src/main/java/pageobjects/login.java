package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {

	
	public WebDriver driver;
	
	By username = By.name("userName");
	
	By password = By.name("password");
	
	By signin = By.name("login");
	By text1 = By.xpath("//font[text()='Flight Details ']");

	public login(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public login(By username, By password, By signin) {
		super();
		this.username = username;
		this.password = password;
		this.signin = signin;
	}

	public WebDriver getDriver() {
		return driver;
	}

	


	public WebElement getUsername()
	{
		return driver.findElement(username);
	}
	

	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getsignin()
	{
		return driver.findElement(signin);
	}
	
	public WebElement getText1()
	{
		return driver.findElement(text1);
	}
	
	
	
}
