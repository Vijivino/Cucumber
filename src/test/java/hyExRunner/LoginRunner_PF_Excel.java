package hyExRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/hyExLogin.feature",glue="hyExlStepdefinition")


public class LoginRunner_PF_Excel {

}
