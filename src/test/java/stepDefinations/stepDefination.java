package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageobjects.login;
import pageobjects.portalhomepage;
import pageobjects.registration;
import resource.Base;

public class stepDefination extends Base{
	
	
	 @Given("^initialize the browser chrome$")
	 
	    public void initialize_the_browser_chrome() throws Throwable {
		 driver = initializeDriver();
	        Thread.sleep(3000);
	    }
	 @And("^Navigate to \"([^\"]*)\" site$")
	    public void navigate_to_something_site(String strArg1) throws Throwable {
		 Thread.sleep(3000);
		 driver.get(strArg1);
	       
	    }
	 @And("^click  on login button to naivgate homepage$")
	    public void click_on_login_button_to_naivgate_homepage() throws Throwable {
	        
		 
		 login l = new login(driver);
		 l.getsignin().click();		 
		 
		 
	    }



	    @When("^user enteers (.+) and (.+) and logsin$")
	    public void user_enteers_and_and_logsin(String username, String password) throws Throwable {
	    	
	        login l1 = new login(driver);
	        l1.getUsername().sendKeys(username);
	        
	        l1.getpassword().sendKeys(password);
	        l1.getsignin().click();
	        
	    }

	    @Then("^Verify that user successfully login$")
	    public void verify_that_user_successfully_login() throws Throwable {
	        
	    	portalhomepage p = new portalhomepage(driver);
	    	boolean text = p.getText().isDisplayed();
	    	driver.findElement(By.xpath("//a[text()='SIGN-OFF']")).click();
	    
	    }

	    

	   
	    @And("^close the browser$")
	    public void close_the_browser() throws Throwable {
	       driver.quit();
	    }
	    @When("^user click on registration link$")
	    public void user_click_on_registration_link() throws Throwable {
	      
	    	registration r = new registration(driver);
	    	
	    	r.getLink().click();
	    	
	    }

	    @Then("^registration page should be open$")
	    public void registration_page_should_be_open() throws Throwable {
	    	
boolean el = driver.findElement(By.xpath("//img[@src ='/images/masts/mast_register.gif']")).isDisplayed();
	    	
	    	Assert.assertTrue("User is present on new registration page", el);
	        
	    }

	    @And("^Fill the form$")
	    public void fill_the_form() throws Throwable {
	    	
	    	registration r1 = new registration(driver);
	    	
	    	r1.getFirstname().sendKeys("test");
	    	
	    	r1.getlasttname().sendKeys("test1");
	    	r1.getphone().sendKeys("989351713");
	    	r1.getmail().sendKeys("mail@gmail.com");
	    	r1.getaddress().sendKeys("test By Shubbham");
	    	r1.getcity().sendKeys("Pune");
	    	r1.getstate().sendKeys("Maharastra");
	    	Select select = new Select(r1.getcountry());
	    	select.selectByIndex(2);
	    	r1.getnewusername().sendKeys("test1again");
	    	r1.getnewpass().sendKeys("9893151713");
	    	r1.getcnfmpass().sendKeys("9893151713");
	    	
	       }

	    @And("^click on submit button$")
	    public void click_on_submit_button() throws Throwable {
	    	
	    	registration r2 = new registration(driver);
	    	r2.getsubmit().click();
	    	
	    boolean link =	r2.getSign().isDisplayed();
	    Assert.assertTrue("Registration successfull", link);
	    }

	    

	}