package com.hrm.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.hrm.stepdefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class TestRunner {
}
