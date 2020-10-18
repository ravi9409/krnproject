package com.krn.actitime.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {
	
	
	public WebDriver driver;
	public ExcelLibrary excellibrary;
	@BeforeClass
	public void openBrowser()
	{
		excellibrary=new ExcelLibrary();
		System.setProperty("webdriver.chrome.driver", "H:\\Student DVD\\Chrome Driver\\latest\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://online.actitime.com/umlaut/login.do");
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@BeforeMethod
	public void login()
	{
		
		String string=excellibrary.getExcelData("Login", 1, 0);
		String string1=excellibrary.getExcelData("Login", 1, 1);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(string);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(string1);
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		
	}
	@AfterMethod
	  public void logout()
	  {
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		  
	  }
	  @AfterClass
	  public void closeBrowser()
	  {
		  driver.close();
		  System.out.println("Close Browser");
	  }
}
