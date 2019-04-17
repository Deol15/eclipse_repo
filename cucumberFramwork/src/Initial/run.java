package Initial;


	import cucumber.api.CucumberOptions;
	import cucumber.api.testng.AbstractTestNGCucumberTests;

	@CucumberOptions(features= {"Feature_Demo/para.feature"},glue= {"step_Difination"})

	public class run extends AbstractTestNGCucumberTests {

	}



