package StepSignup;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupSteps {
	
	@Given("user is on signup page")
	public void user_is_on_signup_page() {
		System.out.println("user is on signup page");
	}

	@When("user enters email, password, confirmPassword, firstName, lastName, phoneNumber and city")
	public void user_enters_email_password_confirm_password_first_name_last_name_phone_number_and_city() {
	   System.out.println("User Input text to user enters email, password, confirmPassword, firstName, lastName, phoneNumber and city");
	}

	@And("click on signup button")
	public void click_on_signup_button() {
	    System.out.println("user click button signup");
	}

	@Then("user succesfully signup")
	public void user_succesfully_signup() {
	   System.out.println("user succesfully signup");
	}

}
