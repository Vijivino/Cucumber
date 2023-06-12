package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BackgroundTagsTest {


	WebDriver driver;

	@Given("user can launch demo shop")
	public void user_can_launch_demo_shop() {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();

	}

	@Then("user should check title")
	public void user_should_check_title() {

		Assert.assertTrue(driver.getTitle().contains("Shop"));
		driver.quit();
	}


	@Then("user check page source")
	public void user_check_page_source() {
		
		assert driver.getPageSource().contains("shop");
	    driver.quit();
	}
	
	






}
