package step_Difination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MYfirstSd {
	WebDriver driver;

	@Given("^open url$")
	public void open_url() {
		String path = "F:\\selenium\\Driver march 19\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

	@When("^enter valid user name$")
	public void an() {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Manjot");
	}

	@Then("^enter password$")
	public void ac() {
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("1234");
	}

}
