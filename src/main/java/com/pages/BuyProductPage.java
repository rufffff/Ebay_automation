package com.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

import com.base.*;

public class BuyProductPage extends Base
{
	
	//PageFactory
			@FindBy(xpath = "//input[contains(@id,'qtyTextBox')]")
			WebElement quantity;
			
			@FindBy(xpath = "//a[contains(@id,'isCartBtn_btn')]")
			WebElement AddToCart;
			
			@FindBy(xpath = "//a[contains(text(),'Buy It Now')]")
			WebElement BuyNow;
			
			@FindBy(xpath = "//button[contains(@id,'sbin-gxo-btn')]")
			WebElement Guest;
			
			@FindBy(xpath = "//a[contains(text(),'Buy It Now')]")
			WebElement BuyBtn;
			
			
			@FindBy(xpath = "//select[contains(@id,'country')]")
			WebElement country;
			
			@FindBy(xpath = "//option[contains(@value,'IN')]")
			WebElement india;
			
			@FindBy(xpath = "//INPUT[contains(@ID,'firstName')]")
			WebElement fname;
			
			@FindBy(xpath = "//INPUT[contains(@ID,'lastName')]")
			WebElement lname;
			
			@FindBy(xpath = "//INPUT[contains(@ID,'addressLine1')]")
			WebElement address;
			
			@FindBy(xpath = "//INPUT[contains(@ID,'city')]")
			WebElement city;
			
			@FindBy(xpath = "//option[contains(@value,'KA')]")
			WebElement KA;
			
			@FindBy(xpath = "//input[contains(@id,'email')]")
			WebElement email;
			
			@FindBy(xpath = "//input[contains(@id,'emailConfirm')]")
			WebElement cemail;
			
			@FindBy(xpath = "//input[contains(@id,'postalCode')]")
			WebElement code;
			
			@FindBy(xpath = "//input[contains(@id,'phoneNumber')]")
			WebElement pnumber;
			
			@FindBy(xpath = "//button[contains(text(),'Done')]")
			WebElement done;
			
			
			
			public String validateTitle() {
				return driver.getTitle();
			}
			
			public void openb() throws InterruptedException
			{
				Thread.sleep(3000);
				
				driver.get("https://www.ebay.com/itm/232472461475?_trkparms=5373%3A0%7C5374%3AFeatured%7C5079%3A6000007704");
				
			}
			
			public void clickquantity()
			{
				PageFactory.initElements(driver, this);
				 quantity.click();
			}
			public void enterquantity() throws InterruptedException
			{
				//Thread.sleep(5000);
				pause();
				quantity.clear();
				pause();
				//Thread.sleep(5000);
				 quantity.sendKeys("2");
				 pause();
				 //Thread.sleep(5000);
			}
			
			public void addtocart()
			{
				
				 AddToCart.click();
			}
			public void atctitle()
			{
				String expectedTitle = "eBay shopping cart";
				String actualTitle = validateTitle();
				AssertJUnit.assertEquals(actualTitle, expectedTitle);
			}
			public void buynow() throws InterruptedException
			{
				
				 BuyNow.click();
				 pause();
				// Thread.sleep(5000);
				 Guest.click();
				 pause();
				// Thread.sleep(30000);
			}
			public void bntitle()
			{
				String expectedTitle = "Checkout | eBay";
				String actualTitle = validateTitle();
				AssertJUnit.assertEquals(actualTitle, expectedTitle);
			}
			
			
			
			public void guestlog() throws InterruptedException
			{
				PageFactory.initElements(driver, this);
				driver.get("https://www.ebay.com/itm/232472461475?_trkparms=amclksrc%3DITM%26aid%3D111001%26algo%3DREC.SEED%26ao%3D1%26asc%3D20180105095853%26meid%3D92fc92c631234654a1bb72f612914928%26pid%3D100903%26rk%3D2%26rkt%3D3%26sd%3D223212478305%26itm%3D232472461475%26pmt%3D1%26noa%3D1%26pg%3D2510209%26brand%3DInvicta&_trksid=p2510209.c100903.m5276");
				driver.manage().window().maximize();
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,250)", "");
				pause();
				//Thread.sleep(5000);
				BuyBtn.click();
				pause();
				 //Thread.sleep(3000);
				 Guest.click();
				// pause();
				//Thread.sleep(5000);
			}
			
			

			public void uDetails() throws InterruptedException
			{
				country.click();
				   india.click();
				   fname.sendKeys("Surya");
				   lname.sendKeys("Kumar");
				   address.sendKeys("124, Jawahar Street, Bangalore - 400215");
				   city.sendKeys("Carmelaram");
				   KA.click();
					
					email.sendKeys("abcdfrsgh@gmail.com");
					cemail.sendKeys("abcdfrsgh@gmail.com");
			
					code.sendKeys("451280");
					pnumber.sendKeys("9854125445");
					pause();
					//Thread.sleep(10000);
					done.click();
			}

}