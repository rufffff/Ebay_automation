package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.util.ExcelReader;

import io.github.bonigarcia.wdm.WebDriverManager;



public class SignInPage extends Base {
	
	
	//PageFactory
	@FindBy(xpath="/html/body/header/div/ul[1]/li[1]/span/a")
	WebElement Signin;
	
	@FindBy(id="signin_fb_btn")
	WebElement continuewithFacebook;
	
	@FindBy(xpath="//a[text()='English (UK)']")
	WebElement FacebookEnglish;
	
	@FindBy(name="email")
	WebElement Facebookemail;
	
	@FindBy(name="pass")
	WebElement FacebookPassword;
	
	@FindBy(id="loginbutton")
	WebElement FacebookLogin;
	
	@FindBy(id="signin_appl_btn")
	WebElement continuewithApple;
	
	@FindBy(id="account_name_text_field")
	WebElement AppleUsername;
	
	@FindBy(id="sign-in")
	WebElement arrow;
	
	@FindBy(id="password_text_field")
	WebElement ApplePassword;
	
	@FindBy(id="userid")
	WebElement Username;
	
	@FindBy(id="signin-continue-btn")
	WebElement continuebtn;
	
	@FindBy(id="switch-account-anchor")
	WebElement switchbtn;
	
	@FindBy(xpath = "//a[text()='Need help signing in?']")
	WebElement needhelptosigninbtn;
	
	@FindBy(id="emailWithCode-btn")
	WebElement emailWithCodebtn;
	
	@FindBy(id="emailwithcode-continue-btn")
	WebElement emailwithcodecontinuebtn;
	
	@FindBy(id="text-btn")
	WebElement textbtn;
	
	@FindBy(id="text-continue-btn")
	WebElement textcontinuebtn;
	

	
	//sign in page
	public void Homepage() {
		Initialization();
	}
	
	public void gotoSignIN() {
		PageFactory.initElements(driver, this);
		Signin.click();
	}
	
	
	
	public void Sheet() throws Exception 
	{
		 WebDriver driver;
		 ExcelReader ewo = new ExcelReader();
		// JavascriptExecutor js;
		
		
		ewo.setExcelFile("C:\\Users\\HP\\Downloads\\Logins.xlsx", "data");		
		int NoOfRows = ewo.getRowCount("data");
		
		
		for(int i=1;i<NoOfRows;i++)
		{
			
			String uname = ewo.getCellData(i, 0, "data");
			String pass = ewo.getCellData(i, 1, "data");

			System.out.println(uname);
			System.out.println(pass);

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();	
			driver.get("https://www.ebay.com/");
			
			driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
			Thread.sleep(30000);
			
			
			
			
			driver.findElement(By.id("userid")).sendKeys(uname);
			
			driver.findElement(By.id("signin-continue-btn")).click();
			
			 Thread.sleep(5000);
			driver.findElement(By.id("pass")).sendKeys(pass);
			Thread.sleep(2000);
			
			driver.findElement(By.id("sgnBt")).click();
		    Thread.sleep(2000);
			
			
			

			driver.close();
		}
			
	}
	
	
	
	
	
	//continue with fb
	public void Facebook(){
		 pause();
		 continuewithFacebook.click();
		 FacebookEnglish.click();
		
	}
	
	public void Facebook_Username() {
		Facebookemail.sendKeys("rufahmed26@gmail.com");
		
	}
	
	public void Facebook_Password() {
		FacebookPassword.sendKeys("rufahmed026");
		
	}
	
	public void Facebook_LogIn() {
		FacebookLogin.click();
		
	}
	
	//continue with apple
	public void Apple() {
		pause();
		continuewithApple.click();
		}

	
	public void Apple_Username() {
		AppleUsername.sendKeys("yururu");
		arrow.click();
		pause();
		
	}
	
	public void Apple_Password() {
		ApplePassword.sendKeys("wytywyyue");
		
	}
	
	public void Apple_LogIn() {
		pause();
		arrow.click();
	}
	
	//switch acc
	public void otherUsername() {
		pause();
		Username.sendKeys("Solo");
		
	}
	
	public void continueButton() {
		continuebtn.click();
	}
	
	public void switchAccout() {
		pause();
		switchbtn.click();
	}
	
	public void corretUsername()  {
		pause();
		Username.sendKeys("rufahmed26@gmail.com");
		
	}
	
	
    //need help to sign in Email method
	public void needHelpToSigningIn() {
		pause();
		needhelptosigninbtn.click();
	}
	
	public void receiveEmail()  {
		pause();
		emailWithCodebtn.click();
	}
	
	public void sleep() throws InterruptedException {
		Thread.sleep(2000);
		
	}
	
	public void emailOptContinue() {
		emailwithcodecontinuebtn.click();
	}
	
	
	 //need help to sign in Text method
	public void receiveText() {
		pause();
		textbtn.click();
	}
	
	public void textOtpContinue()  {
		pause();
		textcontinuebtn.click();
		
	}
	
}
