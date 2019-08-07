package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.ju

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "features"
		.glue{"stepDefinition"},
		//format = {pretty","html:test-output}
		
		)

public class TestRunner {

}
