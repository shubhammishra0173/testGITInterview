package Demaoutmaven.E2Eprojectcopy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.login;
import pageobjects.registration;
import resource.Base;


public class HomePage extends Base  {

	public static Logger log =LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();

	}
	@Test(dataProvider="getData")
	
	public void basePageNavigation(String Username,String Password,String text) throws IOException
	{

		//one is inheritance

		// creating object to that class and invoke methods of it
		driver.get(prop.getProperty("url"));
		registration r=new registration(driver);
		
		login lp=new login(driver);
		lp.getsignin().click(); //driver.findElement(By.css()
		lp.getUsername().sendKeys(Username);
		lp.getpassword().sendKeys(Password);

		log.info(text);
		
		lp.getsignin().click();
		
		}

	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}

	
	@DataProvider
	public Object[][] getData()
	{
		// Row stands for how many different data types test should run
		//coloumn stands for how many values per each test
		
		// Array size is 2
		// 0,1
		Object[][] data=new Object[2][3];
		//0th row
		data[0][0]="mercuary";
		data[0][1]="mercuary";
		data[0][2]="Restrcited User";
		//1st row
		data[1][0]="werwerew";
		data[1][1]="443543059";
		data[1][2]= "Non restricted user";
		
		return data;
		
		
		
		
		
		
	}
	
}
