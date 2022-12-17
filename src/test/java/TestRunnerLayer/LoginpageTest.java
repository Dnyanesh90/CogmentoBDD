package TestRunnerLayer;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"AllFeatureFileFolder/cogmentoLogin.feature"},
		glue= {"StepDefinationLayer"},
		monochrome=true,
		dryRun=false
		)
public class LoginpageTest {

}
