package com.qspiders.utilities;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import com.qspiders.base.TestBase;
import com.qspiders.utilities.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Generics extends TestBase

{
	public static  ExtentReports repo = ExtentManager.getinstance();
	
	public static ExtentTest report_Test;

	public void click(String locator_key)
	{
		String str = locator_key;
		str = str.substring(str.indexOf('_')+1);
		
		/*if(locator_key.endsWith("id"))
		{
			driver.findElement(By.id(object.getProperty(locator_key))).click();
		}
		else if (locator_key.endsWith("className")) 
		{
			driver.findElement(By.className(object.getProperty(locator_key))).click();
			
		}
		else if (locator_key.endsWith("tagName")) 
		{
			driver.findElement(By.tagName(object.getProperty(locator_key))).click();
			
		}
		else if (locator_key.endsWith("xpath")) 
		{
			driver.findElement(By.xpath(object.getProperty(locator_key))).click();
			
		}*/
		
		Class<By> cls = By.class;
		try 
		{
			driver.findElement((By)cls.getMethod(str, String.class).invoke(cls, object.getProperty(locator_key))).click();
		} 
		catch ( Exception e) 
		{
			System.out.println(e);
		}
		report_Test.log(LogStatus.INFO,"clicking on locator "+locator_key);
	}
	
	public void type(String locator_key,String value)
	{
		String str = locator_key;
		str = str.substring(str.indexOf('_')+1);
		Class<By> cls = By.class;
			try 
			{
				WebElement txt = driver.findElement((By)cls.getMethod(str, String.class).invoke(cls, object.getProperty(locator_key)));
				txt.sendKeys(value);
			}
			catch (Exception e) 
			{
				System.out.println(e);
			}
		report_Test.log(LogStatus.INFO, "Entered input for locator "+locator_key);
	}
	
}


