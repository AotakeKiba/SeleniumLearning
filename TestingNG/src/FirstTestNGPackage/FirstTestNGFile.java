package FirstTestNGPackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

import org.testng.annotations.Test;

public class FirstTestNGFile {
//  @Test
//  public void f() {
//  }
		
	  public String baseUrl = "http://demo.guru99.com/test/newtours/";
	  String driverPath = "C:\\Users\\evanr\\Documents\\Eclipse\\Driver\\chromedriver.exe";
	  public WebDriver driver; 
	  
	  public String expected = null;
	  public String actual = null;
	
	// run before running the TestNG  
	@BeforeTest
	public void LaunchBrowser() {
		ChromeOptions option = new ChromeOptions();
	    option.addArguments("--remote-allow-origins=*");
	    
		System.out.println("launching Chrome browser"); 
		System.setProperty("webdriver.chrome.driver", driverPath);
	    
	    driver = new ChromeDriver(option);
	    driver.get(baseUrl);
	}
	
	// run before running each Test Annotation
	@BeforeMethod
    public void verifyHomepageTitle() {
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
	
	// test case first priority
	@Test(priority = 0)
    public void register(){
        driver.findElement(By.linkText("REGISTER")).click() ;
        expected = "Register: Mercury Tours";
        actual = driver.getTitle();
        Assert.assertEquals(actual, expected);
    }
	
	// test case second priority
	@Test(priority = 1)
    public void support() {
          driver.findElement(By.linkText("SUPPORT")).click() ;
          expected = "Under Construction: Mercury Tours";
          actual = driver.getTitle();
          Assert.assertEquals(actual, expected);
    }
	
	// run after running each Test Annotation
	@AfterMethod
    public void goBackToHomepage ( ) {
          driver.findElement(By.linkText("Home")).click() ;
    }
	
	// run after running the TestNG  
    @AfterTest
    public void TerminateBrowser() {
	    driver.close();
    }
}
