package stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableTest {
	
	
	WebDriver driver;
	
	@Given("launch the login page")
	public void launch_the_login_page() {
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
	}
	@When("User enter the credentials as email and password")
	public void user_enter_the_credentials_as_email_and_password(DataTable dataTable) {
	    
		List<List<String>> data = dataTable.asLists();
					
		driver.findElement(By.id("Email")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("Password")).sendKeys(data.get(0).get(1));
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}
	@Then("User should validate the login")
	public void user_should_validate_the_login() {
	  

		boolean displayed = driver.findElement(By.xpath("//a[text()='Log out']")).isDisplayed();
		Assert.assertTrue(displayed);

		driver.quit();
		
	}



}
