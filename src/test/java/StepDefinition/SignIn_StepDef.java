package StepDefinition;

import com.pages.SignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignIn_StepDef {
	
SignInPage sign= new SignInPage();
	
	
	@Given("User is in home page")
	public void user_is_in_home_page() {
	
	    sign.Homepage();
	}

	@When("User click on the Sign in")
	public void user_click_on_the_sign_in_link() {
	   sign.gotoSignIN();
	}

	@Then("Application navigates to Sign in page")
	public void application_navigates_to_sign_in_page() {
	    sign.tearDown();
	}
	
	@Given("User is in the Sign up page")
	public void user_is_in_the_sign_up_page() {
	   
	}
	
	
	
	@When("User entering details")
	public void user_entering_details() throws Exception {
	    sign.Sheet();
	}
	
	@Then("User reaches the home page")
	public void user_reaches_the_home_page() {
	    
	}
	
	

@When("User click on Continue with Facebook")
public void user_click_on_continue_with_facebook() {
   sign.Facebook();
}

@When("User enters Facebook username or email")
public void user_enters_facebook_username_or_email() {
    sign.Facebook_Username();
}

@When("User Enter Facebook password")
public void user_enter_facebook_password() {
   sign.Facebook_Password();
}

@When("User click on Log In")
public void user_click_on_log_in() {
    sign.Facebook_LogIn();
}

@Then("Signed up succesfully by Facebook account")
public void signed_up_succesfully_by_facebook_account() {
    sign.tearDown();
}

@When("User click on Continue with Apple")
public void user_click_on_continue_with_apple()  {
  sign.Apple();
}

@When("User enters Apple userId")
public void user_enters_apple_user_id()  {
   sign.Apple_Username();
}

@When("User enters Apple password")
public void user_enters_apple_password() {
    sign.Apple_Password();
}

@When("User click on sign in arrow")
public void user_click_on_sign_in_arrow()  {
   sign.Apple_LogIn();
}

@Then("Signed up succesfully by Apple account")
public void signed_up_succesfully_by_apple_account() {
  sign.tearDown();
}

@When("User mistakely enters wrong Email or username")
public void user_mistakely_enters_wrong_email_or_username() {
    sign.otherUsername();
}

@When("User click on Continue")
public void user_click_on_continue() {
    sign.continueButton();
}

@When("User click on Switch account link")
public void user_click_on_switch_account_link() {
    sign.switchAccout();
}

@When("User enter correct  Email or username")
public void user_enter_correct_email_or_username() {
	try {
		sign.corretUsername();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

@Then("user account is changed")
public void user_account_is_changed() {
    sign.tearDown();
}

@When("User enters the Email or username")
public void user_enters_the_email_or_username() throws InterruptedException{
    sign.corretUsername();
}

@When("User clicks on Need help signing in?")
public void user_clicks_on_need_help_signing_in() {
    sign.needHelpToSigningIn();
}

@When("in Email Click on Receive email")
public void in_email_click_on_receive_email() {
   sign.receiveEmail();
}

@When("Enter OTP received on registered email")
public void enter_otp_received_on_registered_email() throws InterruptedException {
    sign.sleep();
}

@When("Ater entering opt recieved in email and click Continue")
public void ater_entering_opt_recieved_in_email_and_click_continue() {
   sign.emailOptContinue();
}

@Then("User reached the home page")
public void user_reached_the_home_page() {
   sign.tearDown();
}

@When("in Text Click on Receive text")
public void in_text_click_on_receive_text(){
    sign.receiveText();
}

@When("Enter OTP received on registered Phone number")
public void enter_otp_received_on_registered_phone_number() throws InterruptedException  {
    sign.sleep();
}

@When("Ater entering opt recieved in phone number and click Continue")
public void ater_entering_opt_recieved_in_phone_number_and_click_continue() {
    sign.textOtpContinue();
}


}
