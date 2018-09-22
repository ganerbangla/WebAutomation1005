package runner_cukes;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features/",
		glue={ "helper_classes", "step_definitions", "runner_cukes"},  // These must be glued
		
		tags = {"~@wip", "@GoogleFooterLinkTest"},
		monochrome = true,
		plugin = {"pretty", "html:target/cucumber-html_report", "junit:target/cucumber-junit-results.xml"}

		)


public class TestRunner extends AbstractTestNGCucumberTests {


}

