package com.krn.actitime.tasks;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.krn.actitime.testbase.BaseClass;
import com.krn.actitime.testbase.ExcelLibrary;

public class CreateCustomer extends BaseClass{
	
  @Test(priority = 1)
  public void testCreateCustomer() throws InterruptedException {
	  
	  
	  driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//div[@class='title ellipsis']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
      Thread.sleep(2000);
      
      String customerName=excellibrary.getExcelData("CreateCustomer", 1, 0);
      String description=excellibrary.getExcelData("CreateCustomer", 1, 1);
      driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("Ravi");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(description);
      Thread.sleep(5000);
      driver.findElement(By.xpath("//*[@id='customerLightBox_content']/descendant::div[@class='commitButtonPlaceHolder']")).click();
      Thread.sleep(5000);
	  
  }
  
  
}
