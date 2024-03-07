package ListenerTest;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.Assert;

@Listeners(ListenerTest.class)

public class TestCases {
	
	public WebDriver SettingDriver () {
		String driverPath = "C:\\Users\\evanr\\Documents\\Eclipse\\Driver\\chromedriver.exe";
		ChromeOptions option = new ChromeOptions();
	    option.addArguments("--remote-allow-origins=*");
	    
		System.out.println("launching Chrome browser"); 
		System.setProperty("webdriver.chrome.driver", driverPath);
	    
	    WebDriver driver = new ChromeDriver(option);
	    return driver;
	}
	
	// Test to pass as to verify listeners .		
	@Test		
	public void Login()				
	{	
		WebDriver driver = SettingDriver();	    
	    driver.get("http://demo.guru99.com/V4/");					
	    driver.findElement(By.name("uid")).sendKeys("mngr34926");							
	    driver.findElement(By.name("password")).sendKeys("amUpenu");							
	    driver.findElement(By.name("btnLogin")).click();					
	}		

	// Forcefully failed this test as to verify listener.		
	@Test		
	public void TestToFail()				
	{		
	    System.out.println("This method to test fail");					
	    Assert.assertTrue(false);			
	}		
}
