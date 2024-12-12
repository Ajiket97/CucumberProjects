package com.aas.stepdefinations;

import org.testng.Assert;

import com.aas.base.TestContextSetUp;
import com.aas.pages.SignInPage;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInPageStepDefination {
	public TestContextSetUp tcsp;
	public SignInPage sip;
	

	public SignInPageStepDefination(TestContextSetUp testContextSetUp) {
		this.tcsp = testContextSetUp;
		this.sip = testContextSetUp.pob.getSignInPage();
		
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

	@When("User enter valid email id {string} and  click on Continue button")
	public void user_enter_valid_email_id_and_click_on_continue_button(String id) throws InterruptedException {
		
		sip.enterEmail(id);
		sip.clickOnContinueBtn();
	}

	@When("User enter the valid password {string} and click on Keep me logged in checkbox")
	public void user_enter_the_valid_password_and_click_on_keep_me_logged_in_checkbox(String pass) {
		sip.enterPwd(pass);
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
