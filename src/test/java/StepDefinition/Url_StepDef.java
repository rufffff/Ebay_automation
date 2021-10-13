package StepDefinition;
import org.testng.AssertJUnit;

import com.pages.Url;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class Url_StepDef {
	
		
		Url lp;
		
		@Given("User is in the Login Page")
		public void user_is_in_the_login_page() throws InterruptedException {
			lp = new Url();
			lp.Browserurl();
		    
		}

		
		//@SuppressWarnings("deprecation")
		@Then("The title of the page should be {string}")
		public void the_title_of_the_page_should_be(String expectedTitle) throws InterruptedException {
			String actualTitle = lp.BrowserTitle();
			AssertJUnit.assertEquals(expectedTitle, actualTitle);
			
			lp.tearDown();
		   
		}
		

	}


