package TestRunners;

import java.io.File;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)

@CucumberOptions(features= {"src\\test\\java\\com\\app\\features"}
        , monochrome = true
        , format = { "pretty", "html:target/htmlReport/","json:target/JsonReport.json",
		"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"}
        , glue = { "Scenarios" }
        , strict = false
        , dryRun= false
)

public class TestRunner extends AbstractTestNGCucumberTests
{
	
}
