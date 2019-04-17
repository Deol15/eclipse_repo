package step_Difination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class paraa {
	
String path;
WebDriver driver;


@Given("^open url \"([^\"]*)\"$")
public void open_url(String arg1) {
    // Write code here that turns the phrase above into concrete actions
	String path = "F:\\selenium\\Driver march 19\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver = new ChromeDriver();
	driver.get("arg1");
}

@Then("^enter user name \"([^\"]*)\"$")
public void enter_user_name(String arg1) { 
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("arg1");   
}

@When("^enter pass \"([^\"]*)\"$")
public void enter_pass(String arg1)  {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("arg1");

}


}
