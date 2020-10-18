package com.krn.actitime.tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.krn.actitime.testbase.BaseClass;

public class DeleteCustomer extends BaseClass {
	
	@Test(priority = 2)
  public void testDeleteCustomer() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
	      Thread.sleep(3000);
	      String customerName=excellibrary.getExcelData("DeleteCustomer", 1, 0);
	      driver.findElement(By.xpath("//input[@placeholder='Start typing name ...']")).click();
	      driver.findElement(By.xpath("//input[@placeholder='Start typing name ...']")).sendKeys(customerName);
	      Thread.sleep(3000);
	      Actions actions=new Actions(driver);
	      actions.moveToElement(driver.findElement(By.xpath("//span[@class='highlightToken']"))).click().build().perform();
	      Thread.sleep(3000);
	      actions.moveToElement(driver.findElement(By.xpath("//div[@class='titleEditButtonContainer']/div[2]"))).click().build().perform();
	      Thread.sleep(3000);
	      actions.moveToElement(driver.findElement(By.xpath("//div[@id='taskListBlock']/div[5]/div/div/div/div/div/div/div[3]/div/div/div[2]"))).click().build().perform();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//div[@class='taskManagement_customerPanel']/div[4]/div/div[3]/div")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
	      Thread.sleep(3000);
	  
  }
}
//