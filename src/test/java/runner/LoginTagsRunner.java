package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(//features="Features/LoginTags.feature",
                  features="Features",
                  glue= {"stepdefinition"},
                  // tags=  "@valid or @smoke",
                  tags="@valid"
		           )


public class LoginTagsRunner {

}
