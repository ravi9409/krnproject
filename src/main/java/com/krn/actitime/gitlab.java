package com.krn.actitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gitlab {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\Student DVD\\Chrome Driver\\latest\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://gitlab.com/users/sign_in");
		driver.findElement(By.id("user_login")).sendKeys("raviranjan091994@gmail.com");;
		driver.findElement(By.id("user_password")).sendKeys("676001rr");;
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		
	}

}
//