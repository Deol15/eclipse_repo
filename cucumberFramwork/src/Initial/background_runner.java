package Initial;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"Feature_Demo/background.feature"},glue= {"step_Difination"})

public class background_runner extends AbstractTestNGCucumberTests {

}