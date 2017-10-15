package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(format = { "pretty", "html:target/cucumber" }, 
features = { "src/test/resources/feature" }, 
glue = {"practiceSelenium.StepDef" }, 
tags = { "@current" }, 
monochrome = true, 
dryRun = false

		
		
		
		)//End of @CucumberOptions 

public class PracticeSeleniumRunner {

}
