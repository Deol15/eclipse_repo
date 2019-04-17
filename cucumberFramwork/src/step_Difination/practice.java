package step_Difination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class practice {
	String path;
	WebDriver driver;
	
	@Given("^login as valid data$")
	public void login_as_valid_data()  {
		String path = "F:\\selenium\\Driver march 19\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("manjot");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("123456");
	}

	@Given("^Login as invalid data$")
	public void login_as_invalid_data() {
		String path = "F:\\selenium\\Driver march 19\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Sahib");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("123456");
	    
	   



}
}