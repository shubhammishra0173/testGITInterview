package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class portalhomepage {
	
	
	public WebDriver driver;
	By text = By.xpath("//input[@value='roundtrip']");
	public portalhomepage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getText()
	{
		return driver.findElement(text);
	}
	

}
