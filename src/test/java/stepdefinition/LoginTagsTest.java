package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTagsTest {


	WebDriver driver;

	@Given("launch the demo web shop")
	public void launch_the_demo_web_shop() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
	}
	
	@When("enter the email and  password")
	public void enter_the_email_and_password() {
		driver.findElement(By.id("Email")).sendKeys("vijiraja@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("viji123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}
	
	@Then("user should see the logout button")
	public void user_should_see_the_logout_button() {
		boolean displayed = driver.findElement(By.xpath("//a[text()='Log out']")).isDisplayed();
		Assert.assertTrue(displayed);

		driver.quit();
	}
	
	@Given("launch the demo browser")
	public void launch_the_demo_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
	}
	@When("enter the invalid email and  password")
	public void enter_the_invalid_email_and_password() {
		driver.findElement(By.id("Email")).sendKeys("vijira@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("viji123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}
	@When("user should see error message")
	public void user_should_see_error_message() {
	   
		boolean displayed = driver.findElement(By.xpath("//span[contains(text(),'unsuccessful')]")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	@Then("should validate title")
	public void checkTitle() {

		Assert.assertTrue(driver.getTitle().contains("Shop"));
		driver.quit();

		
	}




}
