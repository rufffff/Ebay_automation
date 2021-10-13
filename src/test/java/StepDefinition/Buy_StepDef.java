package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.Base;
import com.pages.BuyProductPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Buy_StepDef
{

	BuyProductPage bp;
	
	@Given("User is in the particular product page")
	public void user_is_in_the_particular_product_page() throws InterruptedException {

		bp=new BuyProductPage();
		bp.Initialization();
		bp.openb();
		
	
	}

	@When("User Click on the Quantity field")
	public void user_click_on_the_quantity_field() throws InterruptedException {
	  bp.clickquantity();
	   
	}

	@When("User Enter the valid number of quantity")
	public void user_enter_the_valid_number_of_quantity() throws InterruptedException {
		 bp.enterquantity();
	   
	}

	@Then("Number of quantity appeared")
	public void number_of_quantity_appeared() {
		bp.tearDown();
	}
	
	@When("User click on the Add to Cart button")
	public void user_click_on_the_add_to_cart_button() {
	   bp.addtocart();
	}

	@Then("The page navigated to the Shopping cart page")
	public void the_page_navigated_to_the_shopping_cart_page() {
		bp.atctitle();
		bp.tearDown();
	}
	
	@When("User Click on the Buy It Now Button")
	public void user_click_on_the_buy_it_now_button() throws InterruptedException {
		  bp.buynow();
	}

	@Then("The page navigated to the Checkout page")
	public void the_page_navigated_to_the_checkout_page() {
		bp.bntitle();
		bp.tearDown();
	}
	
	
	
	@Given("User is in the check out page")
	public void user_is_in_the_check_out_page() throws InterruptedException {

		bp=new BuyProductPage();
		bp.Initialization();
		bp.guestlog();
		
	}

	@When("User enters the details")
	public void user_enters_the_details() throws InterruptedException
	{
	   bp.uDetails();
	}


	@Then("User reaches the Checkout page with the product details")
	public void user_reaches_the_checkout_page_with_the_product_details() {
	   bp.tearDown();
	}



	

}
