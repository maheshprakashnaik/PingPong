package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		//Thread.sleep(8000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[contains(text(),'TASKS')]/following::div[@class='img'])[1]"))));
		driver.findElement(By.xpath("(//div[contains(text(),'TASKS')]/following::div[@class='img'])[1]")).click();
		
		
		driver.findElement(By.xpath("//span[contains(.,'Create Tasks')]")).click();
		driver.findElement(By.xpath("(//button[contains(.,'set deadline')])[1]")).click();
		String expectedMonth = "June 2017";
		String monthName = driver.findElement(By.xpath("(//em[@unselectable='on'])[13]")).getText();
		
		System.out.println(monthName);
		if(!monthName.equals(expectedMonth))
		{
			System.out.println("executing if block");
			driver.findElement(By.xpath("(//em[@unselectable='on'])[13]")).click();
			String month = expectedMonth.substring(0,3);
			System.out.println(month.length());
			String year = expectedMonth.substring(expectedMonth.length()-4);
			System.out.println(month);
			System.out.println(year);
			Thread.sleep(5000l);
			driver.findElement(By.xpath("(//a[text()='"+month+"'])[1]")).click();
			Thread.sleep(1000l);
			driver.findElement(By.xpath("(//a[text()='"+year+"'])[1]")).click();
			Thread.sleep(1000l);
			driver.findElement(By.xpath("(//button[@class='x-date-mp-ok' and contains(text(),'OK')])[1]")).click();
			
			driver.findElement(By.xpath("//span[text()='15']")).click();
		}
		else
		{
			System.out.println("executing else statement");
			driver.findElement(By.xpath("//span[text()='15']")).click();
		}
		
	}

}
