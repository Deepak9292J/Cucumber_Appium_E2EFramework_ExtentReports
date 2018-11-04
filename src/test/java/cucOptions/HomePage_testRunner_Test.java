package cucOptions;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/features/homeScreen.feature","src/test/java/features/homeScreen_2.feature"},dryRun=false, strict=true, monochrome=true,
		glue= "stepdefinitions",
		plugin= {"html:target/cucumber", "json:target/cucumber/cucumber.json" , "junit:target/cucumber/cucumber.xml", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber/report.html"})

public class HomePage_testRunner_Test {

	@AfterClass
    public static void setup() {
        Reporter.loadXMLConfig(new File("src/test/java/resources/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("c-deepak.jindal"));
        Reporter.setSystemInfo("os", "Windows8.1");
        Reporter.setTestRunnerOutput("Sample test runner output message");
    }
}
