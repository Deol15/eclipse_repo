package step_Difination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class datadriven {
	
	String path;
	WebDriver driver;
	@Given("^: open \"([^\"]*)\"$")
	public void open(String arg1) {
		String path = "F:\\selenium\\Driver march 19\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("arg1");
	}
	    
	

	@When("^: Given username as \"([^\"]*)\"$")
	public void given_username_as(String arg1)  {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("arg1");
	}

	@Then("^:given password as\"([^\"]*)\"$")
	public void given_password_as(String arg1) {
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("arg1");
	    
	}

}
