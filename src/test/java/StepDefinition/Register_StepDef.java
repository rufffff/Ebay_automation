package StepDefinition;


	
	
	import com.pages.Register;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;


	public class Register_StepDef {
		
		Register Reg;
		
		@Given("User is in the home page")
		public void user_is_in_the_home_page() throws InterruptedException {
			Reg = new Register();
			Reg.HomePage();
		}

		@When("User clicks on the register")
		public void user_clicks_on_the_register() throws InterruptedException {
			Reg.Regi();
		   
		}

		@When("^User enter the account details (.+) and (.+) and (.+) and (.+)$")
		public void user_enter_the_account_details_and_and_and(String fname,String lname, String mail, String pass) throws InterruptedException  {
			Reg.Paccount(fname, lname, mail, pass);
		}
		

		@When("User clicks on the Register button")
		public void user_clicks_on_the_register_button() throws InterruptedException{
			
			Reg.Preg();
		   
		}

		@Then("Account is Registered")
		public void account_is_registered() throws InterruptedException {
			
			Reg.tearDown();
		    
		}
		
		@When("User enter the Business account details")
		public void user_enter_the_business_account_details() throws InterruptedException  {
			Reg.Baccount();
			
		   
		}
		@When("click on Register button")
		public void click_on_register_button() throws InterruptedException{
			
		    Reg.Breg();
		}

		@Then("Business account is Registered")
		public void business_account_is_registered() throws InterruptedException {
			
			Reg.tearDown();
			
		}
	

}
