package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("User is in login page")
	public void user_is_in_login_page() {
		System.out.println("user is in login page");
	}

	@When("User enter username  and pwd")
	public void user_enter_username_and_pwd() {
		System.out.println("user has to enter uname and pwd");
	}

	@And("User click on login button")
	public void user_click_on_login_button() {
		System.out.println("user click on login btn");
	}

	@Then("User navigate to homepage")
	public void user_navigate_to_homepage() {
		System.out.println("user navigate to homepage");
	}



}
