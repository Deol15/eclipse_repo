package Initial;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"Feature_Demo/tag.feature"},glue= {"step_Difination"},tags="~@FuctionalTest")

public class runner_tag extends AbstractTestNGCucumberTests {

}
 