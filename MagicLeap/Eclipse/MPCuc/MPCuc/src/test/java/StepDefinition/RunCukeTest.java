package StepDefinition;

 
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Feature",
        glue = "StepDefinition",
    	plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
    			"junit:target/cucumber-reports/Cucumber.xml",
    			"html:target/cucumber-reports"},
    	monochrome = true 

        )
public class RunCukeTest {
}