package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) 
	{
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do;jsessionid=B04F083BDD0992CE0E6BCBD58914C73C");
		System.out.println(driver.getTitle());
		String expectedTitle = "actiTIME - Login";
		if(expectedTitle.contains(driver.getTitle()))
		{
			System.out.println("Is displaying");
		
		}
		else
		{
			System.out.println("Is not displaying");
		}
		
		

	}

}
