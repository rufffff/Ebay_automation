package StepDefinition;

import org.openqa.selenium.WebDriver;

import com.base.Base;
import com.pages.Searchpages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Searchfunc_StepDef extends Base {




	WebDriver driver;
	Searchpages search;
	
	@Given("User in home page")
	public void user_in_home_page() {
		search = new Searchpages();
		search.homepage();
	}
	@When("User click on the Search edit box")
	public void user_click_on_the_search_edit_box() {
		search.searchbox();
	}
	@When("User enter the item name in Search edit box")
	public void user_enter_the_item_name_in_search_edit_box() {
		search.itemname();
	}
	@When("User click the Search button")
	public void user_click_the_search_button() {
		search.button();
	}
	@Then("Products will appear")
	public void products_will_appear() {
		search.tearDown();
	}
	@When("User enter the unrelated item name in Search edit box")
	public void user_enter_the_unrelated_item_name_in_search_edit_box() {
		search.unrelateditem();
	}
	@Then("User got the message like error")
	public void user_got_the_message_like_error() throws InterruptedException {
		Thread.sleep(3000);
	    search.tearDown();
	    }
	@When("User click on the  link Daily Deals")
	public void user_click_on_the_link_daily_deals() {
		search.dailydeals(); 
	}
	@Then("User reaches the daily deals page")
	public void user_reaches_the_daily_deals_page() throws InterruptedException {
		Thread.sleep(3000);
	    search.tearDown();
	}
	@When("User click on the link Shop by category")
	public void user_click_on_the_link_shop_by_category() {
		search = new Searchpages();
		search.ShopBycategory();
	}
	@When("Select the different categories")
	public void select_the_different_categories() {
		search.difcategory();
	}
	@Then("Display the selected the product")
	public void display_the_selected_the_product() throws InterruptedException {
		Thread.sleep(3000);
	    search.tearDown();
	}
	@When("User is in product page")
	public void user_is_in_product_page() {
		search.prodpage(); 
	}
	@When("User click on the More filters")
	public void user_click_on_the_more_filters() {
		search.morefilters();
	}
	@When("Select the different Specifications")
	public void select_the_different_specifications() throws InterruptedException {
		search.difspecification();
	}
	@When("Click on the Apply")
	public void click_on_the_apply() {
		search.applybutton();
	}
	@Then("Displayed the Product with given Specificatons")
	public void displayed_the_product_with_given_specificatons() {
		search.tearDown();
	}
	@When("Enter the product name in Search edit box")
	public void enter_the_product_name_in_search_edit_box() {
		search.enteritem();
	}
	@When("Click on the Add to cart button")
	public void click_on_the_add_to_cart_button() {
		search.Addcart();
	}
	@Then("Product will  be Add to cart")
	public void product_will_be_add_to_cart() throws InterruptedException {
		Thread.sleep(3000);
	    search.tearDown();
	}

@When("User click on the Watchlist")
public void user_click_on_the_watchlist() throws InterruptedException {
	
	search.list();
//	driver.findElement(By.xpath("//a[contains(text(),'Watchlist')]")).click();
//	driver.findElement(By.className("rvi__titlelink")).click();
}

@When("Select the multiple products")
public void select_the_multiple_products() {
	search.Multiproduct();
}

@When("Click on the Add to list")
public void click_on_the_add_to_list() {
	search.addlist();
}

@Then("Display the product list")
public void display_the_product_list() {
   search.tearDown();
}



}