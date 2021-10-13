package com.base;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	public static Properties prop; 
	
	public Base() {
		prop = new Properties();
		try {
			
			FileInputStream fis = new FileInputStream("./src/main/java/config/config.properties");
			prop.load(fis);
			}
		catch(FileNotFoundException e) {
				System.out.println("File Not Found");	
			}
		catch(IOException e) {
				System.out.println("Unable to read the file");
				
			}
	}
	
	public void Initialization() {
		//logger = Logger.getLogger(Base.class);
		//logger.info("Trying to get the browser name");
		String browser = prop.getProperty("browser");
		if (browser.equals("Chrome")) {
			//logger.info("Identified the browser as "+ browser);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			//logger.info("Identified the browser as "+ browser);
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("ie")) {
			//logger.info("Identified the browser as "+ browser);
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		//driver.manage().window().maximize();
		//logger.info("Trying to launch the browser application");
	 	driver.get(prop.getProperty("url"));
	 	driver.manage().deleteAllCookies();
		//logger.info("Appplication launched successfully");
	}
	
	
	public void pause() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
	
	public void tearDown() {
		driver.quit();
	}
	
	

}
