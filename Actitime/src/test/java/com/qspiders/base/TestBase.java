package com.qspiders.base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import com.qspiders.utilities.Generics;
import com.relevantcodes.extentreports.LogStatus;
import static com.qspiders.utilities.Generics.report_Test;
import com.qspiders.utilities.ExcelReader;

public class TestBase {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Properties config = new Properties();
	public static Properties object = new Properties();
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\Excel\\TestData.xlsx");

  
  
  @BeforeMethod
  public void setUp(Method method) {
	  
	  report_Test = Generics.repo.startTest(method.getName());
	  if(driver == null)
	  {
		   try 
		  {
			 fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\config.properties");
		  } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  try {
			
			config.load(fis);
			log.debug("Config log file loaded");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  try {
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\Object_Repository.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  try {
			object.load(fis);
			log.debug("Object repository file loaded");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  report_Test.log(LogStatus.INFO, "launching the browser");
		  
		  if(config.getProperty("Browser").equals("Firefox"))
		  {
			  System.getProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Executables\\geckodriver.exe");
			  driver = new FirefoxDriver();
			  log.debug("Firefox browser launched");
		  }
		  else if (config.getProperty("Browser").equals("Chrome")) 
		  {
			  System.getProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Executables\\chromedriver.exe");
			  driver = new ChromeDriver();
			  log.debug("Chrome browser launched");
			
		  }
		  else if (config.getProperty("Browser")=="Internet explorer") 
		  {
			  System.getProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Executables\\IEDriverServer.exe");
			  driver = new InternetExplorerDriver();
			  log.debug("Chrome browser launched");
			
		  }
		  else
		  {
			  log.debug("Invalid driver");
		  }
		  
		  driver.get(config.getProperty("TestURL"));
		  log.debug("Navigated to "+ config.getProperty("TestURL"));
		  driver.manage().window().maximize();
		  //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  wait = new WebDriverWait(driver,30);
	  }
	     
  }

  @AfterTest
  public void teardown() throws InterruptedException {
	  
	  if(driver != null)
	  {
		  report_Test.log(LogStatus.INFO,"Test executed successfully");
		  log.debug("Test executed successfully");
		  driver.quit();
		  Generics.repo.endTest(report_Test);
		  Generics.repo.flush();
		  
		  
	  }
	  
	  
  }

}
