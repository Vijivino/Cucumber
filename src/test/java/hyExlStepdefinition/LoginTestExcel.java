package hyExlStepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import hyExPages.LoginPage_PF_Excel;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestExcel {

	WebDriver driver=null;
	LoginPage_PF_Excel login;
	
	@When("Click login link")
	public void click_login_link() {
	
		login=new LoginPage_PF_Excel(driver);
		login.clickloginlink();
	}

	@When("Enter email and password from excelsheet {string} and rownumber {int}")
	public void enter_email_and_password_from_and_rownumber(String sheetname, Integer rownum) throws IOException {

		//Excel data 
		File credentials=new File("C:\\Selenium Software\\Book1.xlsx");
		FileInputStream credeObj=new FileInputStream(credentials);
		XSSFWorkbook exfile=new XSSFWorkbook(credeObj);
		XSSFSheet sheet1=exfile.getSheetAt(0);
		//int rowNum = sheet1.getLastRowNum();
		
			String email = sheet1.getRow(rownum).getCell(0).getStringCellValue();
			String password=sheet1.getRow(rownum).getCell(1).getStringCellValue();
			System.out.println(email +" "+password);
			login.enteremail(email);
			login.enterpassword(password);
			
		
		
	}	

	@When("Click login button")
	public void click_login_button() {

		login.clickloginbtn();
	}

	@Then("Validate the login functionality")
	public void validate_the_login_functionality() {

		login.logincheck();
		//login.close();
	}


}
