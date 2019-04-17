package Initial;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"Feature_Demo/practice.feature"},glue= {"step_Difination"},tags="~@FuctionalTest")




public class practice_runner extends AbstractTestNGCucumberTests {

}
