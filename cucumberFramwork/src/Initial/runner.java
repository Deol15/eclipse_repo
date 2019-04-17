package Initial;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"Feature_Demo/sample.feature"},glue= {"step_Difination"})

public class runner extends AbstractTestNGCucumberTests {

}
