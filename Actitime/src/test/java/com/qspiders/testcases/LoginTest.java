package com.qspiders.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qspiders.base.TestBase;
import com.qspiders.utilities.ExcelReader;
import com.qspiders.utilities.Generics;
import com.relevantcodes.extentreports.LogStatus;

import static com.qspiders.utilities.Generics.report_Test;



public class LoginTest extends TestBase {
  //public Class<By> cls;

	@Test(priority=2)
 	public void validLoginTest() throws InterruptedException
 	{
	
	
	  
//	  try {
	
//		  Class<By> cls = By.class;
//		  driver.findElement((By) cls.getMethod("id", String.class).invoke(cls, config.getProperty("UserNameField_ID"))).sendKeys("admin");
//		
//		
//	} catch (IllegalAccessException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (IllegalArgumentException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (InvocationTargetException e) {
//		// TODO Auto-generated catch block
//		System.out.println("here we are");
//		e.printStackTrace();
//	} catch (NoSuchMethodException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (SecurityException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	  //driver.findElement(By.id(object.getProperty("UserNameField_ID"))).click();
	  Generics gen = new Generics();
	  WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(object.getProperty("UserNameField_id"))));
	  element.click();
	  //driver.findElement(By.id(object.getProperty("UserNameField_id"))).sendKeys("admin");
	  
	  gen.type("UserNameField_id", excel.getCellValue("Login", 1, 0));
	  //driver.findElement(By.id(object.getProperty("PasswordField_id"))).sendKeys("admin");
	  gen.type("PasswordField_id", excel.getCellValue("Login", 1, 1));
	  
	  gen.click("LoginButton_id");
	  //driver.findElement(By.id(object.getProperty("LoginButton_id"))).click();
	  String dashboard_element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(object.getProperty("DashboardTitle_xpath")))).getText();
	  Assert.assertEquals("Dashboard", dashboard_element);
	  Thread.sleep(3000);
	  gen.click("Welcome_xpath");
	  //driver.findElement(By.xpath("//a[@id='welcome']")).click();
	  Thread.sleep(2000);
	  //driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	  gen.click("LogoutLink_xpath");
	  Thread.sleep(5000);
	  log.debug("Valid login test successfully executed");
	  report_Test.log(LogStatus.INFO, "Valid login test successfully executed");
 	}

@Test(priority = 1)
	public void invalidLogin() throws InterruptedException
	{
	  Generics gen = new Generics();
	  gen.click("UserNameField_id");
	  //WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(object.getProperty("UserNameField_ID"))));
	  //element.click();
	  //driver.findElement(By.id(object.getProperty("UserNameField_id"))).sendKeys("admin");
	  gen.type("UserNameField_id", excel.getCellValue("Login", 2, 0));
	  //driver.findElement(By.id(object.getProperty("PasswordField_id"))).sendKeys("manager");
	  gen.type("PasswordField_id", excel.getCellValue("Login", 2, 1));
	  gen.click("LoginButton_id");
	  //driver.findElement(By.id(object.getProperty("LoginButton_id"))).click();
	  Thread.sleep(2000);
	  Assert.assertTrue(driver.findElement(By.xpath(object.getProperty("InvalidCredential_xpath"))).isDisplayed(), "Error: Invalid credential should not login in to application");
	  log.debug("Invalid login test succesfully executed");
	
	}

}
