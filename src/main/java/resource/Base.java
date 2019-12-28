package resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {

	public WebDriver driver;
	
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	{
		prop = new Properties();
		FileInputStream  fis = new FileInputStream("E:\\eclipse workspace oxygen\\E2Eprojectcopy\\src\\main\\java\\resource\\data.properties");
		
		prop.load(fis);
		
		
		String browserName =  prop.getProperty("browser");
		
		
		System.out.println(browserName);
		
		if(browserName.equals("chrome"))
		
		{
			 System.setProperty("webdriver.chrome.driver", "E:\\eclipse workspace oxygen\\E2Eprojectcopy\\chromedriver.exe");
				driver= new ChromeDriver();	
		}
		

		else if(browserName.equals("ie"))
		
		{
			 System.setProperty("webdriver.chrome.driver", "E:\\eclipse workspace oxygen\\E2Eprojectcopy\\IEDriverServer.exe");
				driver= new InternetExplorerDriver();	
		}
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}
	public void getScreenshot(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:"+result+"screenshot.png"));
		
	}
}
