package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome  = true,
		plugin 		= {	"html:target/cucumber-html-report"},
		glue 		= {	"stepdefs"},
		features 	= { "src\\test\\resources\\features"}
				)
public class RunCucumberTest extends AbstractTestNGCucumberTests {
}