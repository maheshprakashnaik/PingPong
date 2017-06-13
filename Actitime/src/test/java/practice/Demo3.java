package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/overview/defaultcs.aspx");
		driver.findElement(By.xpath("//button[@id='ctl00_ContentPlaceholder1_Button2']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement img = driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceholder1_Panel1']"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='ctl00_ContentPlaceholder1_Panel1']")));
		if(img.isDisplayed())
		{
			System.out.println("Ajax image is displaying");
			
		}
		else
		{
			System.out.println("Ajax image is not displaying");
		}
	}

}
