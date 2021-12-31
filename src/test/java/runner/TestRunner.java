package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		dryRun=false,
		features = {"src/test/resources/features/"},
		glue = {"stepDefinations"}
		)

public class TestRunner {

}
