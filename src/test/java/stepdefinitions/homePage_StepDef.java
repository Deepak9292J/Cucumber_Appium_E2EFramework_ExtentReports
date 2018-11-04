package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.cucumber.listener.Reporter;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import io.appium.java_client.android.AndroidDriver;
import pageObjectRepo.HomeScreenObjects;
import resources.LogsFile;
import utils.appUtils;


public class homePage_StepDef extends appUtils {
	
	HomeScreenObjects homeobj;
	
	public static Logger log = (Logger) LogManager.getLogger(LogsFile.class.getName());

	@Before
	public void setup() throws Exception
	{
   	 driver=capabilities();
   	 LogsFile.startTestCase("Test_Case_Begins");
   	Reporter.addScenarioLog("Test_Case_Begins");

	}


    @Given("^User is on home page$")
    public void user_is_on_home_page() throws Throwable {
    	log.info("On Home screen");
       	Reporter.addStepLog("On Home screen");

    	
    }

    @When("^Click on Dependencies$")
    public void click_on_dependencies() throws Throwable {
    	 homeobj = new HomeScreenObjects(driver);
    	homeobj.home_prefernces.click();
    	log.info("Preferencies clicked");
       	Reporter.addStepLog("Preferencies clicked");

    }

    @Then("^User is taken to the dependencies screen$")
    public void user_is_taken_to_the_dependencies_screen() throws Throwable {
    	log.info("On Preferences screen");
       	Reporter.addStepLog("On Preferences screen");

    }
    
        @When("^Click on Views$")
    public void click_on_views() throws Throwable {
        	homeobj = new HomeScreenObjects(driver);
        	homeobj.home_Views.click();
        	log.info("Views clicked");
           	Reporter.addStepLog("Views clicked");


    }

    @Then("^User is taken to the Views screen$")
    public void user_is_taken_to_the_views_screen() throws Throwable {
    	log.info("On Views screen");
       	Reporter.addStepLog("On Views screen");


    }

    @After
	public void teardown() throws Exception
	{
	     LogsFile.endTestCase("Test_Case_Ends");
	   	 driver.quit();
	   	 log.info("Quit the driver");

	}


}