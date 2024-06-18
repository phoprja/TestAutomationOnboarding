package org.epam.bdd.testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@Registration",
        features = {"src/test/resources/bdd/features"},
        glue = {"org.epam.bdd.stepdefinitions"},
        strict = true,
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class RegistrationRunner {
	
}
