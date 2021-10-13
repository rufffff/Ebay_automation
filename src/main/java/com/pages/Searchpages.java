package com.pages;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Searchpages extends Base {
	
	
	@FindBy(id= "gh-ac")
	WebElement searchEditbox;
	
	@FindBy(id="gh-btn")
	WebElement searchbutton;
	
	@FindBy(id="gh-shop-a")
	WebElement shopcategory;
	
	Base bs;
	public void homepage() {
		bs = new Base();
		bs.Initialization();
		PageFactory.initElements(driver, this);
	}
	public void searchbox() {
		PageFactory.initElements(driver, this);
		searchEditbox.click();
	}
	public void itemname() {
		searchEditbox.sendKeys("tab");
	}
	public void button() {
		searchbutton.click();
	}
	
	public void unrelateditem() {
		searchEditbox.sendKeys("rkvebkbvek");
	}
	public void dailydeals() {
		driver.findElement(By.xpath("//*[@id=\"gh-p-1\"]/a")).click(); 
	}
	public void ShopBycategory() {
		PageFactory.initElements(driver, this);
		shopcategory.click();
		
	}
	public void difcategory() {
		driver.findElement(By.xpath("//*[@id=\"gh-sbc\"]/tbody/tr/td[2]/h3[1]/a")).click();
	}
	public void prodpage() {
		searchEditbox.click();
		searchEditbox.sendKeys("moblie");
		searchbutton.click();
	}
	public void morefilters() {
		driver.findElement(By.xpath("//*[@id=\"s0-14-11-0-1-2-6-2\"]/button")).click();
	}
	public void difspecification() throws InterruptedException {
		WebElement dw= driver.switchTo().activeElement();


		System.out.println(dw);
		Thread.sleep(5000);
		dw.findElement(By.xpath("//form/div[1]/div[2]/div[1]/div/fieldset/div/div[2]/div[2]/label/div/span/input")).click();
	}
	public void applybutton() {
		WebElement dw= driver.switchTo().activeElement();
		dw.findElement(By.xpath("//button[@aria-label='Apply']")).click();
	}
	public void enteritem() {
		searchEditbox.sendKeys("laptop");
		searchbutton.click();
		driver.findElement(By.className("s-item__image-img")).click();
		Set<String>ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		Select s = new Select(driver.findElement(By.id("msku-sel-1")));
		s.selectByIndex(1);
		Select a = new Select(driver.findElement(By.id("msku-sel-2")));
		a.selectByIndex(2);
		Select b = new Select(driver.findElement(By.id("msku-sel-3")));
		b.selectByIndex(1);
	}
	public void Addcart() {
		driver.findElement(By.id("isCartBtn_btn")).click();
	}
	
	public void list() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//*[@id=\"gh-ug\"]/a")).click();
		Thread.sleep(100000);
		driver.findElement(By.xpath("//*[@id=\"gh-eb-My\"]/div/a[1]")).click();
		Thread.sleep(6000);
		driver.findElement(By.className("selected")).click();
		
	}
	public void Multiproduct() {
		// TODO Auto-generated method stub
		driver.findElement(By.className("checkbox__control")).click();
		
	}
	public void addlist() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//button[@accesskey='a']")).click();
		
	}

}