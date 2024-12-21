package com.aas.stepdefinations;

import java.util.Map;

import org.testng.Assert;

import com.aas.base.TestContextSetUp;
import com.aas.pages.SignInPage;
import com.aas.utilities.ExcelReader;
import com.aas.utilities.ExcelUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInPageStepDefination {
	public TestContextSetUp tcsp;
	public SignInPage sip;
	ExcelUtility excelUtility;
	Map<String, String> rowData;

	public SignInPageStepDefination(TestContextSetUp testContextSetUp) throws Exception {
		this.tcsp = testContextSetUp;
		this.sip = testContextSetUp.pob.getSignInPage();
		// excelUtility = new
		// ExcelUtility("C:\\Users\\shrik\\eclipse-workspace\\TheCucumberProject\\src\\test\\resources\\deta.xlsx");
		// // Path to Excel file
	}

	@Given("User is on login page")
	public void user_is_on_login_page() {
		String title = sip.getLandinPageTitle();
		Assert.assertTrue(title.contains("Vestiaire"));
	}

	@Given("User click on Sign in button")
	public void user_click_on_sign_in_button() {
		sip.clickOnSignInBtn();
	}

	 @When("^I fetch data from \"([^\"]+)\" at row \"([^\"]+)\"$")
	public void fetchData(String excelFile, String rowNumber) throws Exception {
		int rowNum = Integer.parseInt(rowNumber);
		rowData = ExcelReader.getRowDataByColumnNames(excelFile, rowNum);
	}

	@When("User enter valid email id and click on Continue button")
	public void user_enter_valid_email_id_and_click_on_continue_button() {
		sip.enterEmail(rowData.get("id"));
		sip.clickOnContinueBtn();
	}

	@When("User enter the valid password and click on Keep me logged in checkbox")
	public void user_enter_the_valid_password_and_click_on_keep_me_logged_in_checkbox() {
		sip.enterPwd(rowData.get("pass"));
		sip.clickOnSignInCheckBox();
	}

	@When("Click on Log in button")
	public void click_on_log_in_button() {
	    sip.clickOnLogInBtn();
	}
	

	@Then("User is on landing page")
	public void user_is_on_landing_page() {
		String title = sip.getLandinPageTitle();
		Assert.assertTrue(title.contains("Vestiaire"));
	}
}
