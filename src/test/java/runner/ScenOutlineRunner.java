package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(  features="Features/scenarioOutline.feature", glue= {"stepdefinition"} , 
                  // plugin= {"usage"} to mention the time
                 plugin={"pretty", "html:htmlreport/scenOutline.html"}, //to show html report under htmlreport folder
             //  plugin={"pretty", "json:jsonreport/scenOutline.json","junit:junitreport/scenreport.xml"},
                 
                 monochrome=true)


public class ScenOutlineRunner {

}
