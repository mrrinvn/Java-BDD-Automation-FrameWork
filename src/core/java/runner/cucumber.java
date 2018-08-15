package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "resources/features" }, glue = { "tests" }, plugin = { "html:target/Reports" })
public class cucumber {
}
