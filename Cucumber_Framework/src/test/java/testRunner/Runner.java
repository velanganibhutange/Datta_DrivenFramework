package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"FeatureFiles"},monochrome = true,glue = {"stepDefinations"},plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Reports/supplier.html","pretty","html:target/cucumber-reports"})
public class Runner {

}