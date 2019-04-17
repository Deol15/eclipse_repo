package step_Difination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class tag {
	String path;
	WebDriver driver;
	

	@Given("^login as valid user$")
	public void login_as_valid_user() {
		String path = "F:\\selenium\\Driver march 19\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("manjot");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("123456");
	    
	   
	}

	@Given("^Enter the invalid username &password$")
	public void enter_the_invalid_username_password() {
		String path = "F:\\selenium\\Driver march 19\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("manjot");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("123456");
	    
	   
	}

	@Given("^the username & password$")
	public void the_username_password()  {
		String path = "F:\\selenium\\Driver march 19\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9872780350");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
	    
	   
	}

	@Then("^Edit useerprofile with valid data$")
	public void edit_useerprofile_with_valid_data()  {
	   



}
}