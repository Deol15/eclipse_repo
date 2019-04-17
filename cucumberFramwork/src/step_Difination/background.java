package step_Difination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class background {
	String path;
	WebDriver driver;
	
	@When("^enter the username \"([^\"]*)\"$")
	public void enter_the_username(String arg1) {
		String path = "F:\\selenium\\Driver march 19\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(arg1);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(arg1);
	}

	@Then("^enter the password \"([^\"]*)\"$")
	public void enter_the_password(String arg2)  {
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(arg2);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(arg2);
	}
	   



}

