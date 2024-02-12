package LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


 
   public class WebdriverMaven{

	public static String browser ="ChromeDriver";
	
	 public static ChromeDriver driver ;
	
	public void setup() {
		
		driver = new ChromeDriver();
	}
	
	
	@Test
	public void doLogin() {
		
	driver.get("htttp:\\gmail.com")	;
	driver.findElement(By.id("email")).sendKeys("amrita.bhatia30@gmail.com");
	driver.findElement(By.id("passwd")).sendKeys("amritadeepak@26");
	/*
	 * 
	 * added new comments
	 * 
	 * 
	 */
		
	}
		
	@AfterMethod
	public void tearDown() {
		
		
		driver.quit();
	}

	
		}
	
	
	
	
	
	
	
	
	
	

