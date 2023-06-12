package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/BackgroundTags.feature", glue= {"stepdefinition"})

public class BackgroundTagsRunner {

}
